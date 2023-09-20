package com.loginform;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.loginform.entity.Login;
import com.loginform.repository.LoginRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LoginRepoTest {
	@Autowired
	private LoginRepository loginRepo;
	@Test
	public void saveLogin() {
		Login l = new Login("sam@gmail.com","sam");
		loginRepo.save(l);
	}

}
