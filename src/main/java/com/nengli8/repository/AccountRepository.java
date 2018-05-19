package com.nengli8.repository;

import com.nengli8.domain.Account;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 11369 on 2018/5/19.
 */
@Repository
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
    public Account findAccountByName(String name);
    public Account findAccountByUuid(String uuid);
}
