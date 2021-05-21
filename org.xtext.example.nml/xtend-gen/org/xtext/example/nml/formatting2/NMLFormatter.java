/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.nml.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.nml.nML.DomainCP;
import org.xtext.example.nml.nML.OctopusCP;
import org.xtext.example.nml.nML.OursCP;
import org.xtext.example.nml.nML.StatementCS;
import org.xtext.example.nml.nML.TopLevelCP;
import org.xtext.example.nml.nML.TransformationCP;
import org.xtext.example.nml.nML.modelTypeCS;
import org.xtext.example.nml.services.NMLGrammarAccess;

@SuppressWarnings("all")
public class NMLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private NMLGrammarAccess _nMLGrammarAccess;
  
  protected void _format(final TopLevelCP topLevelCP, @Extension final IFormattableDocument document) {
    EList<DomainCP> _ownedDomains = topLevelCP.getOwnedDomains();
    for (final DomainCP domainCP : _ownedDomains) {
      document.<DomainCP>format(domainCP);
    }
    EList<StatementCS> _ownedPre = topLevelCP.getOwnedPre();
    for (final StatementCS statementCS : _ownedPre) {
      document.<StatementCS>format(statementCS);
    }
    EList<OctopusCP> _ownedOctopus = topLevelCP.getOwnedOctopus();
    for (final OctopusCP octopusCP : _ownedOctopus) {
      document.<OctopusCP>format(octopusCP);
    }
    EList<OursCP> _ownedOurs = topLevelCP.getOwnedOurs();
    for (final OursCP oursCP : _ownedOurs) {
      document.<OursCP>format(oursCP);
    }
    EList<TransformationCP> _ownedTransformation = topLevelCP.getOwnedTransformation();
    for (final TransformationCP transformationCP : _ownedTransformation) {
      document.<TransformationCP>format(transformationCP);
    }
  }
  
  protected void _format(final OctopusCP octopusCP, @Extension final IFormattableDocument document) {
    EList<modelTypeCS> _ownedModels = octopusCP.getOwnedModels();
    for (final modelTypeCS modelTypeCS : _ownedModels) {
      document.<org.xtext.example.nml.nML.modelTypeCS>format(modelTypeCS);
    }
    EList<StatementCS> _ownedConditions = octopusCP.getOwnedConditions();
    for (final StatementCS statementCS : _ownedConditions) {
      document.<StatementCS>format(statementCS);
    }
  }
  
  public void format(final Object octopusCP, final IFormattableDocument document) {
    if (octopusCP instanceof XtextResource) {
      _format((XtextResource)octopusCP, document);
      return;
    } else if (octopusCP instanceof OctopusCP) {
      _format((OctopusCP)octopusCP, document);
      return;
    } else if (octopusCP instanceof TopLevelCP) {
      _format((TopLevelCP)octopusCP, document);
      return;
    } else if (octopusCP instanceof EObject) {
      _format((EObject)octopusCP, document);
      return;
    } else if (octopusCP == null) {
      _format((Void)null, document);
      return;
    } else if (octopusCP != null) {
      _format(octopusCP, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(octopusCP, document).toString());
    }
  }
}