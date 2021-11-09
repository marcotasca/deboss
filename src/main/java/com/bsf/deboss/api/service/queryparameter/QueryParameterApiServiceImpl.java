package com.bsf.deboss.api.service.queryparameter;

import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingRequestParameterDto;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriBuilder;

@Service
public class QueryParameterApiServiceImpl implements QueryParameterApiService {

    @Override
    public UriBuilder createSearchQueryParametersForProducts(UriBuilder uriBuilder, SearchProductRequestParameterDto search) {
        if(search == null) return uriBuilder;
        if(search.getWhat() != null) uriBuilder.queryParam(SearchProductRequestParameterDto.Placeholder.WHAT.getPlaceholder(), search.getWhat());
        if(search.getCountry() != null) uriBuilder.queryParam(SearchProductRequestParameterDto.Placeholder.COUNTRY.getPlaceholder(), search.getCountry());
        if(search.getCurrency() != null) uriBuilder.queryParam(SearchProductRequestParameterDto.Placeholder.CURRENCY.getPlaceholder(), search.getCurrency());
        if(search.getItemsPerPage() != null) uriBuilder.queryParam(SearchProductRequestParameterDto.Placeholder.ITEMS_PER_PAGE.getPlaceholder(), search.getItemsPerPage());
        if(search.getCursor() != null) uriBuilder.queryParam(SearchProductRequestParameterDto.Placeholder.CURSOR.getPlaceholder(), search.getCursor());
        return uriBuilder;
    }

    @Override
    public UriBuilder createSearchQueryParametersForUserFollowerFollowing(UriBuilder uriBuilder, UserFollowerFollowingRequestParameterDto search) {
        if(search == null) return uriBuilder;
        if(search.getLimit() != null) uriBuilder.queryParam(UserFollowerFollowingRequestParameterDto.Placeholder.LIMIT.getPlaceholder(), search.getLimit());
        if(search.getLastOffsetId() != null) uriBuilder.queryParam(UserFollowerFollowingRequestParameterDto.Placeholder.LAST_OFFSET_ID.getPlaceholder(), search.getLastOffsetId());
        return uriBuilder;
    }

}
