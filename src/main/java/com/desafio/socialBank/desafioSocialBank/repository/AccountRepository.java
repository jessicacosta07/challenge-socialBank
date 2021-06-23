package com.desafio.socialBank.desafioSocialBank.repository;

import com.desafio.socialBank.desafioSocialBank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
