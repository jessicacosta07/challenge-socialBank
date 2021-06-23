package com.desafio.socialBank.desafioSocialBank.service;

import com.desafio.socialBank.desafioSocialBank.model.Account;
import com.desafio.socialBank.desafioSocialBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> searchAcoount(){return accountRepository.findAll(); }

    public void saveAccount(Account account){
        accountRepository.save(account);
    }

    public Optional<Account> getAccount(Integer id) { return accountRepository.findById(id); }

    public void deleteAccount(Integer id){
        accountRepository.deleteById(id);
    }
}
