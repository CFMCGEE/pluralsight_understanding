package mockito;

public class Mocking {

                /*

                                    Mocking
                                    - This allows you to focus on the unit you're trying to test by replacing the unit's real dependencies with test-only collaborators
                                    - This also allows you to reason about the unit in isolate without having to deal with the rest of the codebase at the same time
                                    - Can mock a class (and/or interface)
                                    - Open source
                                    - Readable tests
                                    - Eliminates non-determinism
                                     - Removes randomness
                                    - Reduces complexity
                                     - Increases flexibility
                                    - Improves test execution
                                     - Speed
                                     - Reliability
                                    - Supports collaboration
                                     - Mocking actual dependencies
                                    - Test Doubles
                                     - Objects
                                      - Dummy
                                       - Not used in the test
                                       - Fills-in holes
                                       - Just keeps the compiler happy
                                      - Fake
                                       - Implementation that is unsuitable for production
                                       - In-memory DB
                                       - Fake web service
                                      - Stub
                                       - Provided 'canned' answers
                                       - Not intelligent enough to respond with anything else
                                       - Multiple variations are possible
                                      - Partial Mocks
                                       - Spy
                                        - Similar with to a stub but more intelligent
                                        - Used in the later stages of a project
                                        - Keeps track of how it was used
                                        - Helps with verification
                                        - Occasional usage
                                        - Spies on real objects
                                        - Creates a copy of the object, it doesn't delegate calls
                                      - Mock
                                       - Uses exceptions
                                       - Can fail test if unexpected calls are made
                                       - The focus on the behavior verification
                                    - Verification
                                     - State Verification
                                      - All other Test Doubles do it
                                      - Verify resulting state
                                      - Exception: Spies can verify behavior
                                     - Behavior Verification
                                      - Mocks always use it
                                      - Verify interactions
                                      - Can add state verification on top
                                    - Unit
                                     - Can be a collection of a few classes together
                                    - Argument Matches
                                     - Increased flexibility for method stubbing (verification also)
                                     - Useful when you're not focused on the values of the arguments
                                     - When you want to define a return value for a range of arguments (or an unknown argument)
                                    - Mocking Final Methods
                                     - Final methods/classes can be mocked just like non-final ones
                                    - Selective Partial Methods
                                     - Allows Test Doubles to be selective by enabling real methods
                                    - Behavior-Driven Development (BDD)
                                     - Extension of Test Driven Development
                                     - Given, When, Then
                                     - BDDMockito
      */

}
