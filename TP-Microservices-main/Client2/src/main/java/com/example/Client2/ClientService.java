package com.example.Client2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Client2.entities.Client;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService{
	@GetMapping(path="/client/{id}")
	public Client clientById(@PathVariable Long id);
}
