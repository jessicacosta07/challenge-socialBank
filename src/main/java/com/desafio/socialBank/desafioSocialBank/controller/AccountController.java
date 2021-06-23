package com.desafio.socialBank.desafioSocialBank.controller;

import com.desafio.socialBank.desafioSocialBank.model.Account;
import com.desafio.socialBank.desafioSocialBank.service.AccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/accounts")
@Api(value = "API RESTfull Accounts")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/list")
    @ApiOperation(value = "Retorna a lista de contas")
    public List<Account> list(){
        return accountService.listAllAccount();
    }

    @GetMapping("/saldo_atual/{id}")
    @ApiOperation(value = "Retorna uma única conta baseado no saldo")
    public ResponseEntity<Account> get(@PathVariable Integer id){
        try {
            Account account= accountService.getAccount(id);
            return new ResponseEntity<Account>(account, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    @ApiOperation(value = "Adicionar contas na lista")
    public void add(@RequestBody Account account) { accountService.saveAccount(account);}

    @PutMapping("/update/{id}")
    @ApiOperation(value = "Atualizar contas da lista")
    public ResponseEntity<?> update(@RequestBody Account account, @PathVariable Integer id) {
        try {
            Account existAccount = accountService.getAccount(id);
            account.setId(id);
            accountService.saveAccount(account);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Deletar contas da lista")
    public void delete(@PathVariable Integer id) {
        accountService.deleteAccount(id);
    }
}