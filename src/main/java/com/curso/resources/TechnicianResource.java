package com.curso.resources;

import com.curso.domains.Technician;
import com.curso.domains.dtos.TechnicianDTO;
import com.curso.services.TechnicianService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/technician")
public class TechnicianResource {

    @Autowired
    private TechnicianService techService;

    @GetMapping
    public ResponseEntity<List<TechnicianDTO>> findAll(){ return ResponseEntity.ok().body(techService.findAll());}

    @GetMapping(value = "/{id}")
    public ResponseEntity<TechnicianDTO> findById(@PathVariable Long id){
        Technician obj = this.techService.findById(id);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }

    @GetMapping(value = "/cpf/{cpf}")
    public ResponseEntity<TechnicianDTO> findByCpf(@PathVariable String cpf){
        Technician obj = this.techService.findByCpf(cpf);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }

    @GetMapping(value = "/email/{email}")
    public ResponseEntity<TechnicianDTO> findByEmail(@PathVariable String email){
        Technician obj = this.techService.findByEmail(email);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }
    @PostMapping
    public ResponseEntity<TechnicianDTO> create(@Valid @RequestBody TechnicianDTO objDto){
        Technician newObj = techService.create(objDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<TechnicianDTO> update(@PathVariable Long id, @Valid @RequestBody TechnicianDTO objDto){
        Technician obj = techService.update(id, objDto);
        return ResponseEntity.ok().body(new TechnicianDTO(obj));
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<TechnicianDTO> delete(@PathVariable Long id){
        techService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

