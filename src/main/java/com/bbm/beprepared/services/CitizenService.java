package com.bbm.beprepared.services;

import com.bbm.beprepared.model.Citizen;
import org.springframework.util.concurrent.ListenableFutureCallbackRegistry;

import java.util.List;

public interface CitizenService {

    String createCitizen(Citizen citizen, Long cityId);

    List<Citizen> getAllCitizens();

    List<Citizen> getAllCitizenByCityId(Long cityId);

    List<Citizen> getAllCitizenByProvinceId(Long provinceId);

    Citizen getCitizenById(Long Id);

    String verifyAccount(String otp);

    String generateOTPForCitizen(String phone);


}
