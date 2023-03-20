/*
 * Axelor Business Solutions
 *
 * Copyright (C) 2023 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.production.rest.dto;

import com.axelor.apps.production.db.ManufOrder;
import com.axelor.apps.tool.api.ResponseStructure;
import java.util.List;

public class ManufOrderProductListResponse extends ResponseStructure {

  private final List<ManufOrderProductResponse> productList;

  public ManufOrderProductListResponse(
      List<ManufOrderProductResponse> productList, ManufOrder manufOrder) {
    super(manufOrder.getVersion());
    this.productList = productList;
  }

  public List<ManufOrderProductResponse> getProductList() {
    return productList;
  }
}
