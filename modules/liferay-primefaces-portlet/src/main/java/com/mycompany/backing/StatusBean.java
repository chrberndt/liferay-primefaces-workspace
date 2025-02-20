package com.mycompany.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Christian Berndt
 */
@ManagedBean(name = "statusBean")
@ViewScoped
public class StatusBean {
  private boolean editable;

  public boolean isEditable() {
    return editable;
  }

  public void setEditable(boolean editable) {
    this.editable = editable;
  }
}
