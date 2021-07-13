package com.devonfw.application.devon4j-app-4tutorial.general.common.api.security;

import javax.inject.Named;

import com.devonfw.module.security.common.api.accesscontrol.AccessControlGroup;
import com.devonfw.module.security.common.base.accesscontrol.AccessControlConfig;

/**
 * Example of {@link AccessControlConfig} that used for testing.
 */
@Named
public class ApplicationAccessControlConfig extends AccessControlConfig {

  public static final String APP_ID = "devon4j-app-4tutorial";

  private static final String PREFIX = APP_ID + ".";

  public static final String GROUP_READ_MASTER_DATA = PREFIX + "ReadMasterData";

  public static final String GROUP_ADMIN = PREFIX + "Admin";

  /**
   * The constructor.
   */
  public ApplicationAccessControlConfig() {

    super();
    AccessControlGroup readMasterData = group(GROUP_READ_MASTER_DATA);
    group(GROUP_ADMIN, readMasterData);
  }

}