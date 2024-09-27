package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Address;

public interface AddressService {
    List<Address> getAllAddresses();
    Optional<Address> getAddressById(Long id);
    List<Address> getAddressesByStudentId(Long studentId);
    Address createAddress(Address address);
    Address updateAddress(Long id, Address address);
    void deleteAddress(Long id);
}
