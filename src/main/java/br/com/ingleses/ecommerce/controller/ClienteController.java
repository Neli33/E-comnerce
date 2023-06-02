package br.com.ingleses.ecommerce.controller;

import br.com.ingleses.ecommerce.model.Cliente;
import br.com.ingleses.ecommerce.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> get() {
        return clienteService.buscarTodos();

    }

    @GetMapping("{id}")
    public ResponseEntity getId(@PathVariable Long id) {
        try {
            //Retornar status 200
            return ResponseEntity.ok(clienteService.buscarPorId(id));
            // return clienteService.buscarPorId(id);
        } catch (Exception e) {
            //Tratar o erro
            //Retornando o Status 400
            return ResponseEntity.status(404).body(e.getMessage());
        }

    }

    @PostMapping
    public ResponseEntity post(@RequestBody Cliente cliente) {
        try {
            cliente.setId((null));
            return ResponseEntity.ok(clienteService.salvar(cliente));
        } catch (Exception e) {
            return ResponseEntity.status(404).body(e.getMessage());
        }

    }

    @PutMapping("{id}")
    public ResponseEntity put(@RequestBody Cliente cliente) {
        try {
            cliente.setId(null);
            return ResponseEntity.ok(clienteService.salvar(cliente));
        } catch (Exception e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
        @DeleteMapping("{id}")
        public ResponseEntity delete(@PathVariable Long id) {
            try {
                return ResponseEntity.ok(clienteService.apagar(id));
            } catch (Exception e) {
                return ResponseEntity.status(400).body(e.getMessage());
            }

    }
}