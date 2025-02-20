package com.mycompany.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 * @author Christian Berndt
 */
@ManagedBean(name = "viewManager")
public class ViewManager {

  public void redirect() {
    FacesContext facesContext = FacesContext.getCurrentInstance();
    facesContext.getApplication().getNavigationHandler().handleNavigation(facesContext, null, "viewNonDefault");
  }
}
