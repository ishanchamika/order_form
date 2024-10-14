package com.example.video.controller;

import com.example.video.dto.CustomerDTO;
import com.example.video.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO)
    {
        customerService.addCustomer(customerDTO);
        return "saved";
    }

    @PutMapping(path = "/update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO)
    {
        String updated = customerService.updateCustomer(customerDTO);
        return updated;
    }

    @GetMapping(path = "/get-by-id", params = "id")
    public CustomerDTO getCustomerById(@RequestParam(value = "id") int customerId)
    {
        CustomerDTO customerDTO =  customerService.getCustomerById(customerId);
        return customerDTO;
    }
}
