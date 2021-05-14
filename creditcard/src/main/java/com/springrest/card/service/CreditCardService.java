package com.springrest.card.service;

import org.springframework.stereotype.Service;

@Service
public interface CreditCardService {

	String getCardType(long cardNo);

}

