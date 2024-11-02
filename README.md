# Smart Home Automation System

A feature-rich **Smart Home Automation System** that empowers users to control and monitor a variety of home devices, such as lighting, heating/cooling systems, and geolocation-enabled tracking, all from a central interface. This project is designed with a robust architecture, incorporating **18 design patterns** across creational, structural, and behavioral categories to deliver scalability, efficiency, and modularity.

## Key Features:
- **User Authentication & Session Management**: Manages user sessions with limited concurrent logins based on subscription levels, using Object Pool and Proxy patterns.
- **Device Control & State Management**: Provides efficient control over devices, including state persistence for room-specific devices, leveraging the Command, State, and Memento patterns.
- **Premium Support System**: Allows premium users to access a hierarchical support system, implemented with the Chain of Responsibility pattern.
- **Geolocation & Mapping**: Integrates Google Maps API for real-time device tracking, reducing page load times and enhancing user experience.
- **Messaging & Communication**: Enables efficient communication across different contact groups using Interpreter, Observer, and Iterator patterns.

## Design Patterns Implemented

### Creational Patterns:
1. **Singleton**: Ensures only one instance of the system controller exists, centralizing management of all devices and user interactions.
2. **Factory Method**: Allows for the creation of various smart devices (e.g., lights, thermostats) through a dedicated factory interface.
3. **Abstract Factory**: Provides families of related objects (Philips and Samsung devices) without specifying their concrete classes, enhancing device compatibility.
4. **Prototype**: Enables cloning of existing smart devices, allowing rapid replication without the cost of initializing new objects from scratch.
5. **Object Pool**: Manages a pool of user sessions, limiting access based on subscription plans and ensuring optimized resource utilization.

### Structural Patterns:
1. **Proxy**: Acts as a gatekeeper, authenticating users and controlling access to core functionalities based on subscription type.
2. **Composite**: Organizes devices hierarchically (Floors > Rooms > Devices), allowing batch operations (e.g., turn all lights on in a floor) and streamlined management.
3. **Decorator**: Extends the basic user pool with added features for premium users, like enhanced customer support, without modifying the existing codebase.

### Behavioral Patterns:
1. **Chain of Responsibility**: Routes premium support requests through a chain of handlers, such as AI, general support, and specialist levels, based on issue severity.
2. **Command**: Encapsulates requests for device actions (e.g., turning lights on/off) as commands, allowing flexible control and decoupling of UI components from business logic.
3. **State**: Manages different operational states (on/off) for devices like lights, adjusting behavior dynamically based on the current state.
4. **Memento**: Saves and restores device states (e.g., light settings) for each room, allowing state recovery when switching between rooms.
5. **Interpreter**: Parses natural language commands (e.g., "send [message] to [group]") in the messaging module, simplifying user interactions.
6. **Observer**: Notifies contacts when messages are sent, facilitating real-time updates and enhancing group communication.
7. **Iterator**: Standardizes traversal through collections of contacts (Friends, Family, Work) for message sending, regardless of underlying data structure.

## Benefits
This project leverages design patterns to achieve:
- **Modularity**: Each pattern addresses specific functionality, making the code easier to manage and extend.
- **Scalability**: Designed to handle an expanding number of devices, users, and features with minimal impact on performance.
- **User Experience**: With real-time updates, efficient messaging, and geolocation, users enjoy seamless and responsive interactions.

This **Smart Home Automation System** exemplifies the practical use of design patterns in creating a scalable, maintainable, and feature-rich application, simulating real-world smart home automation. Explore the code to see how these patterns come together to create an efficient, well-architected solution for home automation.
