package com.baeldung.web.controller;

import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class InvoiceController {

    Map<Long, Invoice> invoiceMap = new HashMap<>();

    @ModelAttribute("invoices")
    public void initInvoices() {
        invoiceMap.put(1L, new Invoice("Rental", 1000, 20.0));
        invoiceMap.put(2L, new Invoice("Wages", 20000, 50.0));
        invoiceMap.put(3L, new Invoice("Vehicles", 500, 5.0));
    }

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoiceHome", "invoice", new Invoice());
    }

    @RequestMapping(value = "/invoice/{Id}", produces = { "application/json", "application/xml" }, method = RequestMethod.GET)
    public @ResponseBody Invoice getInvoiceById(@PathVariable final Long Id) { return invoiceMap.get(Id);
    }

    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("concept", invoice.getConcept());
        model.addAttribute("quantity", invoice.getQuantity());
        model.addAttribute("retention", invoice.getRetention());
        model.addAttribute("totalWithRetention", invoice.calculateTotalWithRetention());

        return "invoiceView";
    }

    @ModelAttribute
    public void addAttributes(final Model model) {
        model.addAttribute("msg", "Welcome to your invoices!");
    }
}
