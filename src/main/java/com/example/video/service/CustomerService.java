package com.example.video.service;

import com.example.video.dto.CustomerDTO;

public interface CustomerService
{
    void addCustomer(CustomerDTO customerDTO);
    String updateCustomer(CustomerDTO customerDTO);
    CustomerDTO getCustomerById(int customerId);
}
