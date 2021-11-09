package com.bsf.deboss.api.service.queryparameter;

import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import org.springframework.web.util.UriBuilder;

public interface QueryParameterApiService {
    UriBuilder createSearchQueryParametersForProducts(UriBuilder uriBuilder, SearchProductRequestParameterDto search);
}
