package com.sks;

import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Void> addEmployee(@RequestBody EmployeeCreationRequest request, UriComponentsBuilder uriComponentsBuilder) {
	    URI location = uriComponentsBuilder.path("/api/employees/{id}")
	      .buildAndExpand("99")
	      .toUri();
	    return ResponseEntity.created(location)
	      .build();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeWithId(@PathVariable("id") Long id) {
	    List<Employee> allEmployees = createEmployees();
	    return allEmployees.get(ThreadLocalRandom.current()
	      .nextInt(0, allEmployees.size()));
	}
	
    private List<Employee> createEmployees() {

        Set<String> projects = new HashSet<String>();
        projects.add("proj1");
        projects.add("proj2");
        
        Address add1 = new Address("1","London", "HP17");
        Address add2 = new Address("2","Cardiff", "CF12");
        
        Employee employee1 = new Employee("Andy", add1, UUID.randomUUID().toString(), projects);
        Employee employee2 = new Employee("CF12", add2, UUID.randomUUID().toString(), projects);
        Employee employee3 = new Employee("Clive", add2, UUID.randomUUID().toString(), projects);

        return Arrays.asList(employee1, employee2, employee3);

    }

}
