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

## UCP (User Datagram Protocol)

**Pros:**

- Faster than TCP.
- Simple in its transmission, limited data management.
- Supports broadcasting tasks.

**Cons:**

- Unreliable, cannot guarantee packet delivery due to being datagram-oriented rather than connection-oriented.
- No retransmission of lost data packets.
- Minimal error checking.
- No sequencing, packets may arrive out of order.
- Can overload the receiver, only stops sending data once the task is completed.

**Common Uses:**

- Video Streaming
- Online Gaming
- Generally, applications that rely on the speed of data reception.

Other important protocols are the IP (Internet Protocol) which allows devices to be identified and sought through unique IP addresses, and HTTP (HyperText Transfer Protocol) which allows devices to request and transfer data between devices.




'' OSI (Open Systems Interconnection model)
Protocols like those above work thanks to the OSI model, a conceptual model which ensures systems are standardized to communicate in the same manner and are all organized into partitions of seven layers: Physical, Data Link, Network, Transport, Session, Presentation, and Application. ''

## Hubs and Switches

Both hubs and switches act as a connection point between devices in a network. Both will usually use a wired connection but are increasingly featuring wireless connectivity. Where they differ is how they disperse data through the network after it is received from a device.

A Hub is quick but indiscriminate; when it receives a data packet, it will copy it and quickly send it to every device connected to it.
A Switch is slower but more careful; when it receives a data packet, it determines which device(s) in its system the data is intended for then sends the data to those select devices.
Hubs are best used when all devices would benefit from receiving all the data. In contrast, switches should be used when many different types of devices are on the network or the data is sensitive and should not be forwarded indiscriminately.


## Routers

If we think of LANs as towns and hubs/switches as our town halls, then routers would be the roads that connect them. Located at gateways, the intersect point between two or more networks, these devices sort and forward data packets to the correct destination between two or more separate networks.

This knowledge is essential as most systems will require not one large network but rather smooth interworking between multiple separate networks. The advantage of dividing systems this way is twofold: it minimizes the device load on any individual network and also keeps all data immediately accessible to devices where it is most pertinent.

When planning a network or later in a systems design interview, it’s essential to define:

- how your system would be split into sub-networks
- what interconnection these networks would need with each other and external systems
- how routers should be set up to ensure system efficiency.

## Latency Cost of Routers

Connections across router bridges between networks will have higher latency than in-network connections; to improve efficiency, put devices the work together frequently or require swift transfers on the same network rather than passing the data across router bridges.

Now that you have an understanding of the tools which go into building a network, you can move to think about how you’d secure it. This is the central challenge facing network designers, by starting to consider it you take one step closer to becoming a network specialist!

While blocking all connections to external systems is a simple and effective way to ensure, there are many times when a connection to external systems will be essential for a system to function effectively. In those cases, some types of firewalls and encryption are essential to minimize internal risk.


## Firewalls

One of the main tools for network security, firewalls act like a checkpoint where data passed to or from private networks is reviewed before being accepted or rejected. There are several types of security functions used by firewall programs. Most use two or more functions to provide variable security protections.


## Web Application Firewall:

The most common function, these applications are configured to block common types of attacks, such as Distributed Denial of Service (DDoS). These applications are simple and cheap but susceptible to novel forms of attack unfamiliar to the program.


## Packet Filtering:

This function reviews each data packet that passes through it, accepting or rejecting based on user-defined rules. These are effective but can be difficult to configure to block all possible threats.


## Circuit-level Gateway Implementation:

This function activates security sweeps when a new TCP/IP or UDP connection links up to the system. Once the check has been completed and the source is deemed secure, data can pass freely through without further checks.


## Proxy Server:

This function masks the network address of connected devices, directing all requests made through an alternative cover device. This provides an added level of anonymity and filtering, as the proxy device acts as a buffer, sending back only specified types of data to the source.

Unfortunately, this function will slow network performance by adding an additional data node to travel through.

## Encryption
Regardless of how effective your initial firewalls are, there may be a time when they fail and data is stolen. To anticipate this, it’s helpful to have a second layer of security built into the system, usually in the form of data encryption.

Encryption is the process of converting data (either in-flight and at-rest) into a form only readable by another authenticated system or device. If data is intercepted in transit by a device without the proper decryption keys, it remains unreadable and secure.

When designing your system, consider the places where encryption will be needed. If a certain area in the system contains sensitive data, such as banking information, it may be wise to include multiple levels of encryption for added protection.

While knowing what specific type of encryption protocol to use is unnecessary (as most companies have in-house policies), you can demonstrate thorough care for security by indicating which network connections will need to be encrypted based on the type of data they pass.

## What is the Internet?

The Internet permeates our very existence. Most of us cannot imagine life without it. We often depend on it for livelihoods, for routine commutes, and for entertainment. It has become almost like a utility. You’re accessing this course through the Internet.

But how does it actually work? What goes on behind the scenes? Well, you’ve come to the right place to learn that! The Internet is a global network of computer networks.

## But First, What’s a Network?

A network is officially defined as a group or system of interconnected people or items.

So, by this definition, train stations connected to each other with rail tracks make up a railway network. People who follow each other on Twitter make up an online social network.

Similarly, computers connected to each other with cable or wireless radio make up a computer network.

## Why Computer Networks?

There are two main purposes of computer networks: Communication using computers and sharing of resources. An “internet” allows doing these two things across different computer networks.

> Note: internet vs. Internet An internet with a lowercase “i” is any interconnection of computer networks. Whereas the global Internet is always spelled with a capital I.

## The Internet

The Internet is essentially a network of computer networks.

So your personal computer is connected to other computers at your house or workplace to create a small computer network, which is in turn connected to other computer networks. And so the global Internet encompasses a complex web of interconnected computer networks.


## A Quick History of The Internet

## Why Learn History?

- Learn about the mistakes made during the development of the Internet and avoid repeating them.

- Understand why some things are designed and work the way they do today.

- Lastly, it’s interesting!

> “Those who do not read history are doomed to repeat it.”
– George Santayana

## The '50s: The Cold War

- The birth of the Internet can be traced back to the middle of the last century.

- The U.S. was in the midst of a cold war with The Soviet Union and both nations were trying to gain an advantage over the other.

- In 1957, the Soviets launched Sputnik, the world’s first satellite, propelling us into the space age.

- This caught the US off-guard, and in response the U.S. government created ARPA (Advanced Research Projects Agency) which was mandated with the responsibility of the technological and scientific advancement of the country.

## The '60s-'70s: ARPANET#

- ARPA was meant to facilitate research. But their computers could not talk to each other.

- ARPA sent out a request for the design of a network that would allow computers across the entire country to talk to each other.

- A network called the ARPANET was developed over the course of a year. In September 1969, the ARPANET was turned on. The first four nodes were at UCLA, Stanford, MIT, and the University of Utah. Over the '70s, other computer networks just like ARPANET sprang up.

- While the computers on one network could communicate via a default way to communicate set by the network administrator of each network, the computers on different networks could not communicate since every network had its own language or - more formally – protocol, which we will introduce in a later lesson.

- Then, a standardized protocol called the Transmission Control Protocol was invented (RFC 675).

- It was also in RFC 675 that the term “Internet” was first used. Later RFCs continued the use.

> 🔎 Did You Know? The Advanced Research Projects Agency (ARPA) is now known as Defense Advanced Research Projects Agency (DARPA) to emphasize the its focus on defense!

## The '80s: Protocols#

- ARPANET was fully migrated to TCP/IP.

- As we moved into the 1980s, computers were added to the Internet at an increasing rate. These computers were primarily from government, academic, and research organizations. Much to the surprise of the engineers, the early popularity of the Internet was driven by the use of electronic mail.

## The '90s: The World Wide Web

- During the 90’s, the researchers at the European Council for Nuclear Research (CERN) felt the need for automated sharing of their findings between their computers. CERN had documents that cross-referenced other documents. So, there were these (hyper) links between documents.

- In 1990 Tim Berners-Lee introduced his World Wide Web project to store and retrieve these inter-connected documents.

- Check out a restored version of the first website ever!

- Later, educational, commercial and so many other applications were realized.

- The World Wide Web got even more popular with the advent of browsers such as Mosaic and Netscape which allowed combining graphics with web navigation!

> … Creating the web was really an act of desperation because the situation without it was very difficult when I was working at CERN later. Most of the technology involved in the web, like the hypertext, like the Internet, multi font text objects, had all been designed already. I just had to put them together. It was a step of generalizing, going to a higher level of abstraction, thinking about all the documentation systems out there as being possibly part of a larger imaginary documentation system." 
– Tim Berners Lee

## Search Engines
- Another fun fact that initially, there were no search engines.

- So how would you find a website? Well, you couldn’t. Either you knew it or you didn’t. Of course, you could land on a website by accident or by following a link from another website that you knew.

- Then, people started creating static indices of the web - a categorized listing of websites. People would sit and randomly click on links to find web pages and add links to their index. But this couldn’t scale. So, eventually, search engines were “invented.”

- Altavista and Yahoo! were among the earlier search engines. According to this Wikipedia article, the first automated web index was World Wide Web Wanderer. Soon afterward, the first web search engine, the W3Catalog was invented.


## The 21st Century: The Age of the Internet

And now here we are. In an age in which all our devices run on the Internet, even toasters for some – the era of the **Internet of Things** is here! Life without it seems almost inconceivable




