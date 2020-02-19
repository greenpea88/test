package com.service;

import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ResponseCode;
import com.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public ResponseCode signup(String userId, String password, String name) throws Exception {
		ResponseCode responseCode = new ResponseCode();

		// String encrypt = Encrypt(password, encKey);
		String encKey = "aa";	//원래 encKey가 랜덤키로 AES 방식 encrypt해서 보안을 하려 했는데 Java에서 그거 어케하는지 찾는 중이었
		userRepository.signup(userId, name, password, encKey);
		responseCode.setResponseCode(0);
		return responseCode;
	}

}
