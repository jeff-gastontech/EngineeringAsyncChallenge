package com.jeffgoyette.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerContactRepository extends JpaRepository<CustomerContact,Long> {
}
