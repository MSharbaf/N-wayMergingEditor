/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml;

import org.xtext.example.nml.NMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class NMLStandaloneSetup extends NMLStandaloneSetupGenerated {
  public static void doSetup() {
    new NMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
