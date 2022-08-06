# Computer networking
## Topic to Learn :
- Computer Network Types
- Wi-Fi Standards
- Internet Protocols
- Hubs and Switches
- Routers
- Firewalls
- Encryption

# Computer Network Types

Regardless of your system’s purpose, it will need a connection protocol to link all devices. This link can be via Ethernet (Local Area Network), WLAN (Wi-Fi), or WAN (Wide Area Network). Each has risks and benefits to consider when deciding which connection type use

# Ethernet (Wired LAN)

- Centralized wired connection between local devices via ethernet cables.
- Faster connection than via wireless.
- Difficult/costly to upgrade the Ethernet speed category once installed.
- Limited distance due to wired requirement.

# WLAN (Wi-Fi)

- Local wireless network connection to a shared Ethernet wired relay.
- Devices can be mobile within the network area.
- Devices can be added or removed from the network seamlessly.
- Not secure; prone to snooping and cyber-attacks.

# WAN (Wide Area Network)
- Similar to LAN but on a wider scale; connects multiple local networks.
- Devices in one LAN network can communicate with those in other connected - LAN networks through pre-configured routers.
- Highly scalable.
- Longer latency based on the system scale.
- Hard to secure, more accessible by outside system forces.

# Cloud Networking

Another newer computer network type is Cloud Networking, which allows developers to connect many devices across a huge geographical area using cloud-based wireless networking systems hosted by third-party service providers. This type is quickly gaining popularity among tech firms due to its cheap execution and versatility.

- Versatile, suited for any business type or scale
- Faster speeds than traditional network types due to the number of cloud servers
- Cheap, lower cost than businesses constructing and managing their own network hardware
- Only accessible with an internet connection
- Often targeted by cyberattacks

# Wi-fi Standards

Companies will often use Wi-Fi networks to link devices in their internal systems. What’s more, many products, either computer or mobile, must be designed to work on home Wi-Fi networks. If asked to design a system reliant on Wi-Fi connections, it’s useful to understand the different Wi-Fi standards.

Wi-Fi connections are all in the 802.11 family of standards but have several subtypes: A, B, G, N, or AC. Each one of these types has a different channel frequency, range limit, and network bandwidth.

AC is the most modern type, with the greatest range, network bandwidth, and least interference than the rest. From here, the network speed, range, and reliability reduce down the list (N is the second best, then G, and so on).

However, due to a combination of costs and use of legacy equipment incompatible with newer connections, companies may run their system on an older standard.

Asking which Wi-Fi standards a company currently uses during your interview or onboarding will demonstrate attention to detail and may set you apart from those who simply assume access to the newest resources.

# Network Protocols

Another decision to make when constructing a system is between data transmission protocols, either **TCP/IP (Transmission Control Protocol) or UDP (User Datagram Protocol).**

These protocols function like data delivery rules, affecting the speed of delivery, sequencing, and error recovery. The most commonly used across the globe is TCP/IP due to its reliability of data delivery and built-in loss-recovery mechanisms. That being said, both protocols have applications that should be considered when designing a system.

# TCP/IP (Transmission Control Protocol):

**Pros:**

- Connection-oriented, connects with the receiving device before transmitting data.
- Reliable; guarantees delivery to the receiving device.
- Checks for errors in data packets.
- Sequenced, packets arrive in-order at the receiving device.
- Contains flow control protocol, guarantees deliverer does not overwhelm receiver with data.

**Cons:**

- Slower than UDP due to extra duties.
- Unable to execute broadcasting tasks

**Common Uses:**

- Email
- World Wide Web (HTTP, HTTPS)
- Generally, applications that call for high reliability where speed is the primary concern.