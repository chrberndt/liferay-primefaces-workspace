package com.mycompany.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Christian Berndt
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
