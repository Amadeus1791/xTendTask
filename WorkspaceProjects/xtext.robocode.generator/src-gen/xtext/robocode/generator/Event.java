/**
 * generated by Xtext 2.21.0
 */
package xtext.robocode.generator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.robocode.generator.Event#getEventType <em>Event Type</em>}</li>
 *   <li>{@link xtext.robocode.generator.Event#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see xtext.robocode.generator.GeneratorPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Event Type</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.robocode.generator.EventType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Type</em>' attribute.
   * @see xtext.robocode.generator.EventType
   * @see #setEventType(EventType)
   * @see xtext.robocode.generator.GeneratorPackage#getEvent_EventType()
   * @model
   * @generated
   */
  EventType getEventType();

  /**
   * Sets the value of the '{@link xtext.robocode.generator.Event#getEventType <em>Event Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Type</em>' attribute.
   * @see xtext.robocode.generator.EventType
   * @see #getEventType()
   * @generated
   */
  void setEventType(EventType value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link xtext.robocode.generator.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see xtext.robocode.generator.GeneratorPackage#getEvent_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // Event
