package com.dehong.sso.core.util;

import com.dehong.sso.core.dto.PageDto;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * Created by dehong on 2018-04-15.
 */
public class PageOptionsUtil {

    private static final Integer DEFAULT_PAGE_SIZE = 10;

    public static SelectOptions getSelectOptions(PageDto opts) {
        int pageSize = opts.getPageSize() == null ? DEFAULT_PAGE_SIZE : opts.getPageSize();
        int currentPage = opts.getCurrentPage() == null ? 1 : opts.getCurrentPage();
        int offset = (currentPage - 1) * pageSize;
        SelectOptions options = SelectOptions.get().offset(offset).limit(pageSize).count();
        return options;
    }

    public static SelectOptions getSelectOptions(Integer currentPage, int pageSize) {
        int offset = (currentPage - 1) * pageSize;
        SelectOptions options = SelectOptions.get().offset(offset).limit(pageSize).count();
        return options;
    }
}
