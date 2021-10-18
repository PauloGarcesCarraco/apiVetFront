package cl.edutecno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.edutecno.model.Pet;

@Service
public class PetServiceImpl implements PetService {
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Pet> findAll() {
		ResponseEntity<List<Pet>>response= restTemplate.exchange("http://localhost:8080/api/v1/pet", 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Pet>>() {
		});
		return response.getBody();
				
	}

}
