package com.iiht.fse.SellerService.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NonFinal
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuyerResponse {
    String message;
    String statusCode;
    String statusMessage;
    List<BuyerErrorResponse> errors;
    List<BuyerInfo> buyerInfo;
}

