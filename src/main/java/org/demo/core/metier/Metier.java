package org.demo.core.metier;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service("métier")
public class Metier implements IMetier{
	
	@Autowired
    private ClientRepository clientRepository;
	
	// implémentation interface
    public List<Client> getAllClients() {
        return Lists.newArrayList(clientRepository.findAll());
    }

}
