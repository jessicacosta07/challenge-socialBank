package com.desafio.socialBank.desafioSocialBank.service;

import com.desafio.socialBank.desafioSocialBank.model.Account;
import com.desafio.socialBank.desafioSocialBank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    public List<Account> listAllAccount() {
        return accountRepository.findAll();
    }

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public Account getAccount(Integer id) {
        return accountRepository.findById(id).get();
    }

    public void deleteAccount(Integer id) {
        accountRepository.deleteById(id);
    }
}
