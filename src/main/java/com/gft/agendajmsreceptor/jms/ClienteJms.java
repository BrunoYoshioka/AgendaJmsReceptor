package com.gft.agendajmsreceptor.jms;

import com.gft.agendajmsreceptor.model.Cliente;
import com.gft.agendajmsreceptor.repository.ClienteRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ClienteJms {
	
	@Autowired
    private ClienteRepository clienteRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteJms.class);
	
	

    @JmsListener(destination = "clienteQueue")
    public void ReceberClienteESalvarNoBD(Cliente cliente) {
    	logger.info("cliente: {}",cliente);
        clienteRepository.save(cliente);
    }
    
}
