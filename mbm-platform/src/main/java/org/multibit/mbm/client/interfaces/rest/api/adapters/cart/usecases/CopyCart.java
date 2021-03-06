package org.multibit.mbm.client.interfaces.rest.api.adapters.cart.usecases;

import org.multibit.mbm.client.domain.model.model.Cart;
import org.multibit.mbm.client.interfaces.common.DomainAdapter;
import org.multibit.mbm.client.interfaces.rest.api.cart.CartDto;

/**
 * <p>Adapter to provide the following to {@link org.multibit.mbm.client.interfaces.rest.api.cart.CartDto}:</p>
 * <ul>
 * <li>Mapping between DTO and domain objects</li>
 * </ul>
 *
 * @since 0.0.1
 *         
 */
public class CopyCart implements DomainAdapter<CartDto, Cart> {

  @Override
  public CartDto on(Cart cart) {

    CartDto dto = new CartDto();

    dto.setId(cart.getId());
    dto.setItemTotal(String.valueOf(cart.getItemTotal()));
    dto.setQuantityTotal(String.valueOf(cart.getQuantityTotal()));

    // TODO Need to inject these
    dto.setCurrencyCode("BTC");
    dto.setCurrencySymbol("Ƀ");

    return dto;
  }

}
