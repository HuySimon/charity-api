package com.test.charity_api.service;

import com.test.charity_api.dto.DonationDTO;
import com.test.charity_api.dto.DonationResponse;

public interface DonationService {

    public DonationResponse getDonation(int pageNo, int pageSize, Long campaignId);

    public void insert(DonationDTO d);
}
