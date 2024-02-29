package com.dsi.backend.service;

import com.dsi.backend.model.AppUser;
import com.dsi.backend.model.Bid;

import java.util.List;

public interface BidService {
    Bid saveBid(Long id, String email, Double offeredPrice);

    List<Bid> fetchBids(Long id, String email);

    Boolean changeBidActiveStatus(Long id, String email);

    Boolean changeBidVisibilityStatus(Long id, String email);

    AppUser updateFinalBuyer(Long id, String sellerEmail, String buyerEmail);

    Boolean revertFinalBuyer(Long id, String sellerEmail);

}
