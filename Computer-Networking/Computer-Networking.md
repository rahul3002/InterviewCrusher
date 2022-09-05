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

## Internet Standards Documents

Standardization has allowed us to achieve interoperability. Different organizations and vendors can develop hardware and software to be connected to the Internet. Unless they agree on a protocol, their hardware and software wouldn’t be able to talk to each other. Standardization is all interested stakeholders sitting together, debating and agreeing on a protocol or design.

Also, it’s important to know **what’s out there, who designed what and why.**

Also, you’d know where to submit your ideas in case you come up with a better design for any of the protocols we’re going to study.

## What Is an RFC?


- An RFC or Request For Comments is a document that contains proposals for new protocols or systems.

- Today, RFCs are submitted to and handled by the Internet Society which has a sub-body called the **Internet Engineering Task Force (IETF)**. This sub-body works on the standardization of Internet protocols and systems.

- An RFC is then deliberated on by experts, revised and then hopefully, eventually adopted as a standard.

## Who Writes RFCs?#
- RFCs are generally written by those who work at IETF, Internet researchers, and specialists. However, an RFC can be written by anyone! Yes, even you can write one. Just write up your findings and submit them to the Internet society’s Independent Submissions page!

- All Internet protocols, like the world wide web, are described by one or more RFCs.

## History

- RFCs were started by Steve Crocker to document details of ARPANET while it was being created. These documents were called Requests For Comments to encourage discussion and not seem too assertive. They used to be written on a typewriter and distributed around ARPA’s office as physical copies with requests for comments.

## Contents of an RFC#
- RFC’s generally start off with a header that contains the category of the document, its identification number, the name(s) of the author(s), and the date.
- Then the document contains its title, a status, and an abstract.
- Then a table of contents after which the document starts.
- The document usually starts with an introduction.

## Types of RFCs#

### Standards Track#
There are two kinds of standards documents: Proposed Standard, and Internet Standard.

Proposed Standard documents are well reviewed and stable but not as mature as an Internet Standard document. Internet Standard documents are technically competent, practically applicable, and publicly recognized. Perhaps one of the most important standard documents that we know about from the Internet history lesson is the one on the Internet protocol, RFC 791.

IETF has documented its internet standards process in RFC 2026. Have a look if you want to learn more about it.

### Historic
These RFCs are usually obsolete and contain details about technologies that are not in use anymore.

### Unknown
Some RFCs cannot be categorized or often do not specify any new standards or findings. These are categorized as unknown.

You can browse all of these categories of RFCs on the RFC retrieve page.

## What Is a Protocol?

### An Analogy

Let’s start with an analogy. Think of your routine conversations. They usually follow a general pattern dictated by predefined rules. For example, most conversations start with greetings and end with goodbyes. They probably go something like this:

```
        you : Hello
        friend : Hey!
...conversation ensues...
        you : Bye!
        friend : GoodBye:)
```

Turns out that end systems also follow such protocols to communicate with each other effectively on the network.

Formally, according to the Oxford Dictionary, a protocol is “a set of rules governing the exchange or transmission of data between devices.” In the next few chapters, we’ll study several network protocols in detail.


## TCP

The **Transmission Control Protocol (TCP)** is one such protocol. It was created to allow end systems to communicate effectively. The distinguishing feature of TCP is that it ensures that data reaches the intended destination and is not corrupted along the way.

## UDP
The **User Datagram Protocol (UDP)** is also one such key protocol. However, it **does not ensure** that data reaches the destination and that it remains incorrupt.

## HTTP
**HyperText Transfer Protocol (HTTP)** is a web protocol that defines the format of messages to be exchanged between web clients, e.g., web browsers and web servers and what action is to be taken in response to the message. The World Wide Web uses this as its underlying protocol.

## Packets

Now that we’ve established that end systems communicate with each other based on set protocols, let’s discuss how they actually communicate. Computers send messages to each other that are made up of ones and zeros (bits).

However, instead of sending messages of possibly trillions of bits all in one go, they’re broken down into smaller units called packets to make transmission more manageable. These smaller sizes make transmission more manageable because most links are shared by a few end-systems. Sending smaller units in succession instead of one big file all in one go makes usage of the network fairer amongst end-systems.

## Addressing

So, applications communicate with each other by sending messages based on protocols. However, packets have to be addressed to a certain application on a certain end system. How do you do that out of potentially millions of end systems and hundreds of applications on each of them? The answer lies in addressing.

An address identifies a sending entity and a receiving entity.

### IP Addresses


- Every device that is connected to the Internet has an address called an ‘IP Address’ which is much like a mailing address.

- IP addresses are 32 bit numbers (in IP version 4).

- The human readable way for looking at these numbers is the dotted decimal notation, whereby the number is considered one octet of bits (8 bits) at a time. Those octets are read out in decimals, then separated by dots.

- Hence, each number can be from 0 to 255. For example, 1.2.3.4.
Some IP addresses are reserved for specific functions. We’ll discuss them in more depth in later lessons.

Check yours by running the following command on a shell on your local setup.

```
curl ifconfig.me -s
```
## Ports

Any host connected to the Internet could be running many network applications. In order to distinguish these applications, all bound to the same IP address, from one another, another form of addressing, known as **port numbers**, is used. Each endpoint in a communication session is identified with a unique IP address and port combination. This combination is also known as a **socket**. So in essence, ports help to address the packet to **specific applications** on hosts.

- IP addresses identify end systems but ports identify an application on the end system.
- Every application has a 16-bit port number. So the port number could range from O TO 2^16 =65535 .
- The ports 0 to 1023 are reserved for specific applications and are called well-known ports.
   - For instance, port 80 is reserved for HTTP traffic.
- The ports 1024−49152 are known as registered ports and they are used by specific, potentially proprietary, applications that are known but not system defined.
     - SQL server for example, uses port 1433

     - It is generally considered best practice not to use these ports for any user defined applications although there is no technical restriction on using them.
- The ports 49152–65535 can be used by user applications or for other purposes (dynamic port allocation for instance, but more on that later).

## Access Networks

 ## The Edge of The Internet: End Systems

 So far, we know that the Internet is a network of networks. Each network is made up of devices, called **end systems**, connected to each other with communication links. Let’s look at each in more detail.

## End Systems#
       
  End systems are devices that are connected to the Internet. They include:

- Desktop computers
- Servers
- Mobile devices
-  IoT devices.

So, an end system can be anything from a rack server to an Internet-enabled toaster. These devices are **often also called edge systems** in networking jargon because they are technically situated at the ‘edge’ of the Internet since **they don’t relay data from one device to another**.

## The Network Edge

The **network edge** is simply the collection of end-systems that we use every day: smartphones, laptops, tablets, etc. However, note that **devices that relay messages (such as routers) are not part of the edge of the Internet**.

## What Are Access Networks?

## Access Networks

Access networks, also known as **the last mile**, consist of the media through which end systems connect to the Internet. In other words, **access networks** are networks that physically **connect end systems to the first router** (also known as the “**edge router**”) on a path which connects them to some other end systems.

## Network Interface Adapter

The network interface adapter enables a computer to attach to a network. Since there are so many different types of networks, network adapters are used so that the user can install one to suit the network to which they want to attach.

Network interfaces also usually have an address associated with them. One machine may have multiple such interfaces.

These interfaces are essentially the physical gateways that connect devices to the Internet.

Most machines then have external ports which network cables can be plugged into. The type of access network depends on the physical media involved. Here are some common access networks:

- **Digital Subscriber Line (DSL)**
- **Cable Internet**
- **Fiber To The Home (FTTH)**
- **Dial-Up**
- **Satellite**
- **WiFi**

## Transmission Rates

The rate at which data is transmitted from one point to another in a network is called the **transmission rate**. In other words, the speed of the network is its transmission rate.

The smallest unit that digital data can be divided into is a bit: a 1 or a 0. Transmission rates are measured in units of **bits/sec**. However, since bits/sec is a really small unit, multiples/prefixes are commonly used. Common prefixes and their interpretation.


For example, a speed of 240 Mbit/second means that 240,000,000 or 240 million bits get transmitted every second!

There are essentially **two** ways that data flows in a network: from an end system or to an end system. The outgoing transmission rate is called the **upload rate**, and the incoming transmission rate is called the **download rate**.

Some networks have varying upload and download transmission rates, called **asymmetric transmission rates**. This is useful because traffic going out from end hosts generally consists of small requests which solicit comparatively much larger responses.

> Note You can check the upload and download transmission rate of your Internet connection from https://www.speedtest.net!


## Types of Access Networks: Cable, FTTH, Dial-Up, and Satellite

## Cable 

-In the case of cable Internet, the TV cable company is the ISP and it relies on the preexisting infrastructure of cable TV to grant Internet access.

- It runs on coaxial cable. Coaxial cable has enough of a frequency range to carry TV channels and a stream of upstream and downstream Internet.

### Slower During Peak Hours 

However, cable Internet can be slower during peak hours, when a majority of users are online at once. This is because cable Internet is a shared broadcast medium: every signal that comes from the ISP is sent to every single home regardless of which one it was meant for.

## Hybrid Fiber Coax


Usually, cable Internet works with a combination of coaxial cable and optic fiber (which we’ll discuss in the next chapter), where the fiber connects optical nodes that exist in every neighborhood to the ISP and coaxial cable further connects the nodes to the houses. This is sometimes referred to as a hybrid fiber coax (HFC). Have a look at the figure below to see how hybrid fiber coax works.

## Transmission Rate
According to DOCSIS 4.0, cable Internet can now operate in symmetric speeds (where both upstream and downstream channels have the same speed) of up to 10 gbps.

## Fiber To The Home: FTTH

Although DSL and cable Internet are incredibly popular, Fiber To The Home or FTTH is another access method. Optic fiber cables are claimed to be the cleanest method to transmit data.

## Transmission Rate

FTTH can be very fast – up to 2.5 gbps.

## Satellite

The Internet can also be accessed via satellites. This can be beneficial in remote areas where other physical access networks are not available.

## Transmission Rate

This would depend on a number of factors including the kind of satellite. Some setups can provide incredibly fast downlink and uplink connections, however, on average, the download rate is at around 
1 mbps and the average upload rate 256 kbps.

## Types by Physical Medium: Guided Physical Media

## Communication Media

Data needs to be transmitted from one end system to another over a medium. There are two kinds of media: **guided** and **unguided**. Each has its own advantages and disadvantages

## Guided Media

A  medium in which the signal is transported on a **confined pathway** is called guided. Some commonly used examples are given below.

## Twisted Pair Copper Wire

This kind of wire is used in DSL and Dial-Up. It consists of pairs of copper wires that are twisted together to reduce electrical interference. Each wire is about a milimeter thick and is one communication link. Generally, several pairs are bundled together in a protective plastic or rubber wrapping.

## Coaxial Cable

Cable Internet runs on coaxial cables. A coaxial cable consists of one copper wire surrounded by an insulating material, followed by a mesh-like cylindrical metallic shield, followed by another insulating cover.


## Fiber Optics
Fiber optic cables carry light instead of electrical signals.

Metallic media suffer from electrical noise and interference from nearby electrical sources such as mains wiring. Since optical fiber carries signals in the form of light, it is **not susceptible to the abundant electrical noise and interference.**

Interference from other light sources is easily mitigated by opaque covering around the optic fiber. Hence, these cables can have incredibly fast transmission rates and can be stretched out over long distances, unlike the rest.

Optical fibers are frequently used in public and enterprise networks when the distance between the communication devices is larger than one kilometer

There are two main types of optical fibers: multimode and single mode.

### Multimode

- Multimode uses LED to send signals.
- Therefore it’s, significantly cheaper than counterpart.
- It can work over several tens of kilometers.
- Multiple light signals travel through the same optic fiber while reflecting off the edges of the fiber at different angles.

### Monomode

- Monomode uses laser for transmission.
- It’s more expensive than multimode.
- Monomode fibers can only work over a few kilometers.
svg viewer
fiber optic cable taken from https://commons.wikimedia.org/wiki/File:Optical_fiber_cable.jpg under CC-BY-SA 3.0
- However, fiber optic has not dominated over the rest, because of the high cost of optical devices. However, fiber to the home is becoming increasingly common.

Also, check out the Optical Carrier transmission rates. They specify the transmission rates of fiber optic cable. At the time of writing, they range from to 51.84 Mbit/sec to 200 Gbit/sec!

### The Internet Is Under the Sea, Not in the Clouds!
Most cross country connections, in fact, are made over fiber optic cable under the sea. If you’re more interested in how underwater cables work, here is an interesting YouTube video by Vox called “Thin underwater cables hold the Internet. See a map of them all.”

## Types by Physical Medium: Unguided Physical Media

### Unguided Media

Means of transmission that are not bound by a confined pathway are called unguided media, such as radio waves. Let’s discuss them in more detail.

### Terrestrial Radio Channels

Radio waves encompass a certain band of the electromagnetic spectrum. They provide many advantages, such as not needing to be physically wired through a building, the ability to cross physical barriers like walls and other objects, and allowing for end systems to be mobile. However, they also have some disadvantages: they’re considered to be less secure since interception is relatively easy.


There are 3 kinds of terrestrial radio channels:

- 1.The kind that operate over very short distances 1-2 meters (Bluetooth)

- 2.The kind that operate over a few 10s to a few hundreds of meters (WiFi)

- 3.Those that operate over a range of kilometers (3G, 4G, and LTE)

The same infrastructure that provides access to cellphones provides access to the Internet. Users typically only need to be within a few kilometers of a base station to connect. Let’s look at a couple of examples.

## Third-Generation Wireless (3G)

Third-generation wireless, or 3G, allows wireless–wide area Internet access that utilizes existing telephone networks. It can provide speeds of in order of 1 Mbps.

## Long-Term Evolution (LTE)#

**Long-Term Evolution** or LTE is rooted in 3G technology, but is faster and can achieve transmission rates of 10s of Mbps. Don’t let the name confuse you, it is not technologically very different from 3G.

## Free-space optical communication#

Free space optical communication is a medium that **employs light to transmit data.** Among the many uses are: communication in space and in remote controls.

In free space optics, lasers can be used to achieve high data rates. However, free space optics suffers from interference by factors like fog, dust particles and smog. Recently, researchers have demonstrated the utility of free space optics for high speed communication in data centers.

## Types by Geographical Distance

## Introduction

Computers or end systems are generally connected together to share resources and information such as an Internet connection and devices such as printers. These networks can be classified by the geographical distance that they span.

## Local Area Networks (LANs)#

A Local Area Network, or a LAN, is a computer network in a small area like a home, office, or school.

> Note ‘small area’ does not imply anything about the number of end systems connected together – just the geographical area. A LAN can consist of hundreds or even thousands of systems.

## Ethernet
Most LANs consist of end hosts connected using Ethernet network adapters to Ethernet switches. Every Ethernet switch has a limited number of ports, and therefore can interconnect a limited number of end hosts. Larger networks within a building are built using multiple Ethernet switches interconnecting different sets of end hosts. These switches may then be connected to each other and the Internet

## WiFi
Increasingly, however, wireless Internet access has become very common. In Wireless LANs or WLANs, a wireless router interconnects different “subnets” and/or may have connectivity to the Internet, which it can extend to the hosts connected to it.

## Metropolitan Area Network (MAN)
A metropolitan area network (MAN) is a computer network that spans the geographical distance of a metropolitan area, such as a city. A MAN may also refer to a set of interconnected LANs via point-to-point links, for example, on a university network. Recently, wireless MANs have become increasingly common.

## Wide Area Networks (WAN)
Wide Area Networks or WANs refer to networks that allow interconnection across large distances. They may span over cities or even countries.

WANs are typically optical fiber-based. Frame relay, ATM, and SONET/SDH are examples of technologies that may be in use.

>Note The Internet itself is a whole lot of LANs, interconnected by means of MANs and WANs.

## SONET/SDH#

Synchronous optical networking (SONET) and the international equivalent, Synchronous Digital Hierarchy (SDH) carries data as optical signals over optical fiber, which means that they can cover large distances. These technologies are incredibly prevalent today.

## Frame Relay
A frame relay was a popular way to connect your LAN to the Internet or to provide an interconnection between LANs at two or more company sites.

## Types by Topology

Computer networks can also be categorized in terms of network topologies that you might have studied about in a high school computer science class. These topologies include:**bus, ring, star, tree, and mesh.** Note that these topologies are strictly logical, i.e., they do not dictate how the wires would be connected physically, but they do dictate how the data flows in the network.

### Bus

Every end system will receive any signal that is sent on the main or **backbone** medium. The medium can be guided or unguided.

### Limitations

- A break in the cable will disrupt the entire network.

- Only one system can transmit at a time.


## Ring

In this topology, end systems communicate with each other through each other. So the message travels along the ring passing each system until the target system itself is reached. Theoretically, n/2 systems can be transmitting to their adjacent neighbor at the same time.

## Limitations

- The basic ring topology is unidirectional so n−1
 end systems would have to transfer messages for end system #1 to talk to end system #n

- A break in the cable will disrupt the entire network.

## Star
All end systems talk to each other through one central device such as a router or switch. Routers and switches are discussed in-depth in the data link layer chapter!

### Limitations

- Hosts can all be transmitting at the same time. 

- However, if the central device fails, the network is completely down.

## Tree

This topology is also known as the **star-bus** topology. It essentially consists of a bunch of star networks connected together with a large bus.

## Mesh
In this topology, every end system is **directly connected** to every other end system.

## Limitations

The mesh topology (if physically realized as a mesh):

- Is expensive
- Hard to scale
- Used in specialized applications only

# Network Infrastructure: The OSI Model

## Introduction to Layered Architectures

When building a large complex system, it helps to approach the problem at gradually increasing levels of abstraction. Thus, systems can be composed of **layers,** each performing a specific set of tasks.

### Why Layers?

Layered architectures give us modularity by allowing us to discuss **specific, well-defined parts of larger systems.** This makes **changing implementation-level details** and **identifying bugs easier.**

### An Analogy: Post

Before we dive deep into different models of the network layer stack, let’s look at an interesting analogy.

Think about posting a letter or a package. The general steps to doing so are as follows,

Notice that a few things are in **parallel with computer networking here.** Here are some examples of how that is the case:

### Layers As Services To Each Other: Layers Are Vertical

**Each layer provides some services to the layer above it.** Furthermore, the layer above is **not concerned with the details of how the layer below performs its services.** This is called **abstraction.** So in this way, the layers communicate with each other in a vertical fashion.

### Vertical Layers in Post

In our letter analogy, each layer is servicing the layer above it. For instance, the postman provides services to the senders and receivers. They collect dropped letters from mailboxes and deliver mail to the houses.

Furthermore, all a sender knows and cares about is that once they write a letter, put it in an envelope, stick a stamp on it and drop it in a letterbox, it will eventually be delivered at the destination. Whether it’s transported on pickup trucks, on railway trains or by air is irrelevant and immaterial to senders. So, how layer 4 does its job is irrelevant to the layers above, and that’s called **abstraction.**

### Vertical Layers in Networks

Similarly, computer networks are conceptually divided into layers that each serves the layer above and below it.

- For example, the top layer in most layered models is called the **application layer.** End-user applications live in the application layer, which includes the web and email and are almost always implemented in software. The application layer is also where an outgoing message starts its journey.

- The application needs an underlying service that can get application messages delivered from source to destination and bring back replies which is what the layer(s) after do(es).

Since the underlying layer collects messages from the upper layer for delivery to the destination and hands over messages destined for the upper layer, **it serves the application layer.** Furthermore, the application layer abstracts, and hence is not concerned with any implementation details of the layers below.

## Layers Communicate with Their Parallels: Layers Are Horizontal

Note that each layer at the sending end has a parallel in the receiving end.

Horizontal Layers in Post#
In the post analogy, the letter writer and receiver appear to be in direct communication with each other. The writer writes, the reader reads, oblivious to the man-hours spent in the lower layers. Similarly, the post office at the sender’s side is in communication with some other post office. They cooperate in getting the letter delivered. At the lowest layer, there could be multiple hops. For instance, there is a bicycle pickup of letters from a box, delivered to the post office. Then, the letters are bundled and sent by pickup truck to an airport. The airport flies the postage to a different airport. The airport sends the postage to a post office by a pickup truck and the delivery ensues. Sometimes there are multiple entities horizontally, but we only see the sender and the receiver.

## Horizontal Layers in Networks

This makes more sense in the case of computer networks. For example, applications in the application layer send and receive data from the network. The application layer on one end system has a parallel on another end system, i.e., a chat app on one end system could be communicating with a chat app on another. **These applications in the application layer are seemingly communicating with each other directly or horizontally.** They are not aware of the layer below.

## Layers Evolve Independently

Any lower layer in this model provides certain services that the upper layer can build other services upon. The upper layer can evolve to build different kinds of services, like going from text-based email to attachments, to the world wide web, to dynamic websites, interactive gaming, interactive video conferencing and so on, all happening in the top layer over the same infrastructure.

## Independent Evolution in Post

- 1.For instance, the item being sent does not necessarily have to be a **letter** – It can also be a **package.**
- 2.It can be put in an **envelope or a box.**
- 3.It can be taken to the **post office, dropped off into a post box, or picked up.**
- 4.The receiver’s end can be a **P.O. box, a home or an office.**

## Independent Evolution in Networks#

The applications in the application layer can send and receive almost any form of data, be it an mp3 file or a word document.

## Encapsulation & Decapsulation#

Each layer adds its own header to the message coming from above and the receiving entity on the other end removes it. The information in each header is useful for transmitting the message to the layer above. Adding the header is called encapsulation and removing it is called decapsulation. Have a look at the following drawing to see how this works.

We have not given names to these layers because we have not introduced them yet, but the general idea is depicted.

## The Open Systems Interconnection (OSI) Model

### Common Models#

There are several models along which computer networks are organized. The two most common ones are the Open Systems Interconnection (OSI) model and the Transmission Control Protocol/Internet Protocol (TCP/IP) model.


### The OSI Model
The OSI Model was developed in the '70s by the Organization for Standardization (ISO). At this time, the Internet was in its infancy and its protocols had not fully matured. The OSI model provides a standard for different computer systems to be able to communicate with each other.

The Layers of the OSI Model

The model splits up a communication system into 7 abstract layers, stacked upon each other.

Network protocols are implemented in software, hardware or a combination of both, and their hardware and software components are organized into these layers. So the main purpose of this ‘network stack’ is to understand how the components of these protocols fit into the stack and work with each other.

Here are some key responsibilities of each layer. Note that we are listing only some of the responsibilities of each layer

## Application Layer
- These applications or protocols are almost always implemented in software.
- End-users interact with the application layer.
- The application layer is where most end-user applications such as web browsing and email live.
- The application layer is where an outgoing message starts its journey so it provides data for the layer below.


## Presentation Layer#
- Presents data in a way that can be easily understood and displayed by the application layer.

- Encoding is an example of such presentation. The underlying layers might use a different character encoding compared to the one used by the application layer. The presentation layer is responsible for the translation.
- Encryption (changing the data so that it is only readable by the parties it was intended for) is also usually done at this layer.

- Abstracts: the presentation layer assumes that a user session is being maintained by the lower layers and transforms content presentation to suit the application.

- End-to-end Compression: The presentation layer might also implement end to end compression to reduce the traffic in the network.


## Session Layer

- The session layer’s responsibility is to take the services of the transport layer and build a service on top of it that **manages user sessions.**

- As we will see shortly, the transport layer is responsible for transporting session layer messages across the network to the destination. The session layer must manage the mapping of messages delivered by the transport layer to the sessions.
A session is an exchange of information between local applications and remote services on other end systems.

  -For example, one session spans a customer’s interaction with an e-commerce site whereby they search, browse and select products, then make the payment and logout.

- **Abstracts:** the session layer assumes that connections establishment and packet transportation is handled by the layers below it.

## Transport Layer

- The **transport layer** also has protocols implemented largely in software.

- Since the application, presentation and session layers may be handing off large chunks of data, the transport layer segments it into smaller chunks.

- These chunks are called datagrams or segments depending on the protocol used.

- Furthermore, sometimes some additional information is required to transmit the segment/datagram reliably. The transport layer adds this information to the segment/datagram.

- An example of this would be the checksum, which helps ensure that the message is correctly delivered to the destination, i.e. that it’s not corrupted and changed to something else on the way.

- When additional information is added to the start of a segment/datagram, it’s called a header.

- When additional information is appended to the end it’s called a **trailer.**


## Network Layer

- Network layer messages are termed as packets.

- They facilitate the transportation of packets from one end system to another and help to determine the best routes that messages should take from one end system to another.

- Routing protocols are applications that run on the network layer and exchange messages with each other to develop information that helps them route transport layer messages.

- Load Balancing There are many links (copper wire, optical fiber, wireless) in a given network and one objective of the network layer is to keep them all roughly equally utilized. Otherwise, if some links are under-utilized, there will be concerns about the economic sense of deploying and managing them.


## Data Link Layer#

- Allows directly connected hosts to communicate. 

- Sometimes these hosts are the only two things on a physical medium. In that case, the challenges that this layer addresses include flow control and error detection/correction.

- Encapsulates packets for transmission across a single link.

- Resolves transmission conflicts i.e., when two end systems send a message at the same time across one singular link.

- Handles addressing If the data link is a broadcast medium, addressing is another data link layer problem,

- **Multiplexing & Demultiplexing:**

- Multiple data links can be multiplexed into something that appears like one, to integrate their bandwidths.

- Likewise, sometimes we disaggregate a single data link into virtual data links which appear like separate network interfaces.

## Physical Layer

- Consists largely of hardware.

- Provides a solid electrical and mechanical medium to transmit the data.

- Transmits bits. Not logical packets, datagrams, or segments.

- Also has to deal with mechanical specifications about the makeup of the cables and the design of the connectors.

## The TCP/IP Model

### Introduction

- The TCP/IP Model, also known as the Internet protocol suite, was developed in 1989.

- Its development was funded by DARPA (Advanced Research Projects Agency (ARPA) was renamed to the Defense Advanced Research Projects Agency (DARPA)!)

- Its technical specifications are detailed in RFC 1122.

- This model is primarily based upon the most protocols of the Internet, namely the Internet Protocol (IP) and the Transmission Control Protocol (TCP).

- The protocols in each layer are clearly defined, unlike in the OSI model. In this course, we’ll largely adhere to the TCP/IP model and take a protocol-oriented approach.

## The Layers of The TCP/IP Stack#

The TCP/IP model splits up a communication system into 5 abstract layers, stacked upon each other. Each layer performs a particular service and communicates with the layers above and below itself.

**Here are the five layers of the TCP/IP model:**

- 1.Application Layer
- 2.Transport Layer
- 3.Network Layer
- 4.Data Link Layer
- 5.Physical Layer


## TCP/IP vs OSI

### Key Differences

TCP/IP | OSI
Is used practically | The OSI model is conceptual and is not practically used for communication

Consists of five layers | Consists of seven layers




- Elaborating further on the first point, OSI is a theoretical model and works very well for teaching purposes, but it’s far too complex for anyone to implement.

- TCP/IP, on the other hand, wasn’t really a model. People just implemented it and got it to work. Then, people reverse-engineered a reference model out of it for theoretical and pedagogical purposes. So, something that “sounds like” a great idea might not be the eventual winner. It’s de facto vs de jure standards.

### Differences in Layer Functionality

The layers in the TCP/IP stack largely perform the same functions as their counterparts in the OSI model, except that the application layer in the TCP/IP model encompasses the functionalities of the top three layers of the OSI model.

### There is No Unanimous Stack

This is an example of where primary sources like RFCs clash with secondary sources like textbooks. There is, in fact, an entire table on Wikipedia dedicated to the prominent layer stacks! Regardless, we’ll be sticking to the TCP/IP model described above.

### The End-To-End Argument in System Design

The TCP/IP protocol suite is heavily influenced by the following design choice, also known as the end-to-end argument.

Implementing intelligence in the core was too expensive, therefore, intelligence was implemented at edge devices. So, the Internet’s design was of intelligent end devices and a dumb and fast core network.

### Packet Switched Core
Furthermore, the core was made packet-switched, which means that packets are routed per-hop, so they can circumvent failures because the requirement was for resilience.

With circuit-switched networks, however, torn connections have to be re-established, if there is still a path.

# The Application Layer

## What Is the Application Layer?


### Key Responsibilities of the Application Layer
The main job of the application layer is to enable end-users to access the Internet via a number of applications. This involves:

- Writing data off to the network in a format that is compliant with the protocol in use.

- Reading data from the end-user.

- Providing useful applications to end users.

- Some applications also ensure that the data from the end-user is in the correct format.

- Error handling and recovery is also done by some applications.
### The Post Analogy

- Imagine you post a package across the world.

- Presumably, the post system would hand it off to an airplane or ship to transport it across the world.

- However, you would take it to the post office first to be shipped off. Carrying the package to the post office is what the application layer does in networks, except that it carries messages to the transport layer!

### Where It Exists

The application layer resides entirely on end-systems. These end-systems can be any Internet-enabled device, be it a refrigerator or a tower PC.

### Application Layer Protocols

Most would argue that user applications are the true purpose of the Internet. If useful applications did not exist, the Internet would not be what it is today.

- The development of the Internet in the last century started with text-based network apps such as e-mail.

- Then came the app: the World Wide Web which revolutionized everything.

- Instant messaging came at the end of the millennium, which has changed the way we communicate.

- Since then, we have come up with voice over IP, (WhatsApp calls), video chat (Skype), and video streaming (YouTube).

- Social media has also taken the world by storm resulting in complex human social networks and businesses building on top of these websites.

- All of these applications run on application layer protocols. Due to the presence of these standard protocols, client applications developed by various vendors can talk to server applications developed by others!

## Network Application Architectures

Before we start off with application layer protocols, it’s important to understand how applications are structured across end systems. This is called the network application’s architecture and it’s designed by application developers. The architecture lays out how the application communicates and with what.

### Client-Server Architecture
In this architecture, a network application consists of two parts: client-side software and server-side software. These pieces of software are generally called processes, and they communicate with each other through messages.

### Servers

The server process controls access to a centralized resource or service such as a website.

Servers have two important characteristics:

- Generally, an attempt is made to keep servers online all the time, although 100% availability is impossible to achieve. Furthermore, servers set up as a hobby or as an experiment may not need to be kept online. Nevertheless, the client must be able to find the server online when needed, otherwise, communication wouldn’t take place.

- They have at least one reliable IP address with which they can be reached.

A good analogy is a 24/7 pizza delivery place. They are always open and have a phone number with which they can always be reached.

### Clients
Client processes use the Internet to consume content and use the services. Client processes almost always initiate connections to servers, while server processes wait for requests from clients.

### An Example
A good example of the client-server architecture is the web.

Take Google for instance. Google has several servers that control access to videos. So when a google.com is accessed, a client process (a browser) requests Google’s homepage from one of Google’s servers. That server was presumably online, got the request, and granted access to the page by sending it.

### Data Centers

Now, you might have noticed that we mentioned that Google has servers and not one server. That’s because, as mentioned previously, when client-server applications scale, one or even two servers can’t handle the requests from a large number of clients. Additionally, servers may crash due to any reason and might stop working. Most applications have several servers in case one fails. Therefore, several machines host server processes (these machines are called servers too), and they reside in data centers.

Data centers are buildings that house servers. Facebook, for example, has “nearly 15 million square feet of data center space completed or under construction, with several million more feet in the planning stages” as of 2018.

### Peer-to-Peer Architecture (P2P)

In this architecture, applications on end-systems called ‘peers’ communicate with each other. No dedicated server or large data center is involved. Peers mostly reside on PCs like laptops and desktops in homes, offices, and universities.

The key advantage of the P2P architecture is that it can scale rapidly – without the need of spending large amounts of money, time or effort.

Regardless of P2P’s decentralized nature, each peer can be categorized as servers or clients i.e., every machine is capable of being a client as well as a server. Strictly speaking, the peer that initiates a connection is the client, and the other one is called the server.

### An Example

A lot of popular applications today, like BitTorrent, are based on P2P architectures.

When a file is downloaded via BitTorrent, the downloading party accesses bits of the file on several other users’ computers and puts them together on its end. No traditional ‘server’ is involved in this scenario.

> 📝 Note: P2P Is Not the Same as File Sharing! Some early P2P applications were used for file sharing. For example, Napster and Gnutella. Because of the massive impact of these P2P applications, a lot of people associate file sharing exclusively with P2P. 

File sharing is a specific application. Whereas P2P is a design principle for distributed systems and an application architecture. 

Also, file sharing is not the only application of P2P. Other examples include: streaming media, telephony, content distribution, routing, and volunteer computing.

### Hybrid
The hybrid architecture involves server involvement to some degree. It’s essentially a combination of the P2P and client-server architectures.

## P2P vs. Client-Server

Before we move on with the details of BitTorrent, it's useful to do a quantitative comparison of the P2P architecture with the client-server architecture.


## Quantitative Comparison of P2P with Client-Server#

Let’s calculate how long it will take to transmit a file from one server to a number of clients based on both the P2P and server-client architectures. The calculations will be performed based on the following givens.

- A server that can upload at a rate of ups where ups is the upload speed in bits/second.

- There are N clients all wanting to download the same file from the server. Client i can upload at a rate of upi bits/second and download at a rate of dwni bits/second.
- The size of the file that all the peers want is 
S.

## Client-Server

Let’s start with the client-server architecture. The following can be observed.

- Since N clients each want a file of size S, the server will have to upload NS The upload rate of the server is ups so the server will take at leas time to transmit the file to all N clients.

- The client with the lowest download rate (dwn 
min will take at least ​time to download the full file.

So, in total the time taken to transmit the file will be the maximum of both of the times above, i.e.:

## How Processes Communicate


## Program vs. Process vs. Thread

We’ve loosely used the term ‘process’ pretty much interchangeably with the term ‘application’ in the last few chapters. Now, let’s now get a finer definition.

- A program is simply an executable file. An application such as MS Word is one example.

- A process is any currently running instance of a program. So one program can have several copies of it running at once. One MS Word program can have multiple open windows.

- A thread is a lightweight process. One process can have multiple running threads. The difference between threads and processes is that threads do lightweight singular jobs.

Processes that exist on the same machine can and do regularly communicate with each other following the rules of the machine’s OS. However, we are more interested in how processes that run on different machines communicate.

## Sockets #

Processes on different machines send messages to each other through the computer network. The interface between a process and the computer network is called a socket. Note that sockets do not have anything to do with hardware – they are software interfaces.

Processes simply direct their messages to sockets and don’t worry about it after that.

## Addressing 

Messages have to be addressed to a certain application on a certain end system. How is it done with potentially millions of end systems and hundreds of applications on each of them?

Well, it’s done via addressing constructs like IP addresses and ports. While both were touched upon previously, we would like to reintroduce ports a bit more in-depth.

## Ports

Since every end-system may have a number of applications running, ports are used to address the packet to specific applications. As stated previously, some ports are reserved such as port 80 for HTTP and port 443 for HTTPS.

### An Analogy: Post

Continuing with our post analogy, you can think of an end-system like a large apartment complex. Each apartment in the complex is an application.

The mailing address of the complex is like the IP address of the end-system. All running applications share it, just like all apartments share the street address.Each application running on a host has a different port number, just like each apartment has a different apartment number.

### Ephemeral Ports

The port that an application will use is usually predefined by its application developers. So an application can have port 3000 reserved for it. But what if several instances (processes) of an application are running at once? How will the system address those processes?

Furthermore, server processes need to have well defined and fixed port numbers so that clients can connect to them in a systematic and predictable way. However, clients don’t need to have reserved ports. They can use ephemeral ports. Servers can also use ephemeral ports in addition to the reserved ones. For instance, a client makes the initial connection to the server on a well-known port and the rest of the communication is carried out by connecting to an ephemeral port on the server.

## HTTP: The Basics

## Introduction


The Internet was an obscure set of methods for file transfer and email used by academics and researchers. The World Wide Web was invented to allow the European research organization CERN to present documents linked by hypertexts. All of that changed though when it caught the public’s eye and popularized the Internet. The web was different from other services such as cable television, because it served content based on demand. People could watch what they wanted. HTTP or HyperText Transfer Protocol is the protocol at the core of the web.

## Objects

- Web pages are objects that consist of other objects.

- An object is simply a file like an HTML file, PNG file, MP3 file, etc.

- Each object has a URL

- The base object of a web page is often an HTML file that has references to other objects by making requests for them via their URL.

> 📝 Note: HTML or HyperText Markup Language is the standard markup language to build webpages.

### The Anatomy of a URL

A URL, or Universal Resource Locator, is used to locate files that exist on servers. URLs consist of the following parts:

- Protocol in use

- The hostname of the server

- The location of the file

 -Arguments to the file


 ### HTTP

Let’s get back into HTTP. It’s a client-server protocol that specifies how Web clients request Web pages from Web servers and how Web servers send them.

Remember the following diagram from the lesson on Network Application Architectures? Well, it was actually outlining HTTP in general.

- The orange arrow represents an HTTP request

- The blue arrow represents an HTTP response


The first message is called an HTTP request and the second one an HTTP response. There’s a whole class of protocols that are considered request-response protocols. HTTP is one of them. We will look in more detail at the HTTP request message in the next lesson and response after that!

Note that HTTP is a stateless protocol: servers do not store any information about clients by default. So if a client requests the same object multiple times in a row, the server would send it and would not know that the same client is requesting the same object repeatedly.

### HTTP Requires Lower Layer Reliability

- Application layer protocols rely on underlying transport layer protocols called UDP (User Datagram Protocol) and TCP (Transmission Control Protocol).

- For now, all you need to know is that TCP ensures that messages are always delivered. Messages get delivered in the order that they are sent.

- UDP does not ensure that messages get delivered. This means that some messages may get dropped and so never be received.

- HTTP uses TCP as its underlying transport protocol so that messages are guaranteed to get delivered in order. This allows the application to function without having to build any extra reliability as it would’ve had to with UDP.

This sort of reliance on other layers for certain jobs is one of the key advantages of a layered architecture!

- TCP is connection-oriented, meaning a connection has to be initiated with servers using a series of starting messages.

- Once the connection has been made, the client exchanges messages with the server until the connection is officially closed by sending a few ending messages.

## Types of HTTP Connections
There are two kinds of HTTP connections:

-  Non-persistent HTTP connections

- Persistent HTTP connections

These two kinds of HTTP connections use TCP differently. Let’s discuss the key advantages and disadvantages of each.

### Non-persistent HTTP

Non-persistent HTTP connections use one TCP connection per request. Assume a client requests the base HTML file of a web page. Here is what happens:

- 1.The client initiates a TCP connection with a server

- 2.The client sends an HTTP request to the server

- 3.The server retrieves the requested object from its storage and sends it

- 4.The client receives the object which in this case is an HTML file. If that file has references to more objects, steps 1-4 are repeated for each of those

- 5.The server closes the TCP connection
For each HTTP request, more requests tend to follow, as well to fetch images, javascript files, CSS files, and other objects.

The underlying TCP connection requires three TCP messages are sent between the client and server. Similarly, when the connection is closed, three TCP messages are sent back and forth between the client and server.

### Persistent HTTP

An HTTP session typically involves multiple HTTP request-response pairs, for which separate TCP connections are established and then torn down between the same client and server. This is inefficient. Later on, Persistent HTTP was developed, which used a single client-server TCP connection for all the HTTP request-responses for a session.

Typically, if there have been no requests for a while, the server closes the connection. The duration of time before the server closes the connection is configurable.

## HTTP: Request Messages

### Introduction
There are two types of HTTP messages as discussed previously:

- HTTP request messages

- HTTP response messages

### HTTP Request Messages

Here is an example of a typical HTTP message:

```
GET /path/to/file/index.html HTTP/1.1
Host: www.educative.io
Connection: close
User-agent: Mozilla/5.0
Accept-language: fr
Accept: text/html
```

It should be noted that,

- HTTP messages are in plain ASCII text

- Each line of the message ends with two control characters: a carriage return and a line feed:
r\n.

- The last line of the message also ends with a carriage return and a line feed!

- This particular message has 6 lines, but HTTP messages can have one or as many lines as needed.

- The first line is called the request line while the rest are called header lines.

### The Anatomy of an HTTP Request Line

The HTTP request line is followed by an HTTP header. We’ll look at the request line first. The request line consists of three parts:

- Method

- URL

- Version

## Exercise: Looking at a Real HTTP Request

### Open up the Developer Tools on Your Browser#

Have a look at this GIF. We were on Firefox here.

- 1.Navigate to any website. We picked google.com.

- 2.Right-click anywhere.

- 3.Click on ‘inspector tools’ in the drop-down menu.

The process should be similar for other browsers.

### Go to the Network Tab#

- The network tab should be one of the tabs on the top-bar (or sidebar in some browsers).

- Find it and click on it.

- There may be a chance that your browser hasn’t logged any network calls. In that case, just reload the page.

### Click on Any Entry#

- You’ll see a bunch of calls. Click on any one of them.

- You’ll see details about the HTTP message including the request headers, the kind of request, and the headers. We encourage you to spend some time exploring this.

## HTTP: Response Messages

### Introduction

```
HTTP/1.1 200 OK
Connection: close
Date: Tue, 18 Aug 2015 15: 44 : 04 GMT
Server: Apache/2.2.3 (CentOS)
Last-Modified: Tue, 18 Aug 2015 15:11:03 GMT 
Content-Length: 6821
Content-Type: text/html

[The object that was requested]
```

It has 3 parts: an initial status line, some header lines and an entity body.

> 📝 Note: HTTP response messages don’t have the URL or the method fields. Those are strictly for request messages.

## Status Line#
- HTTP response status lines start with the HTTP version.

## Status Code#

- The status code comes next which tells the client if the request succeeded or failed.
- There are a lot of status codes:

- 1xx codes fall in the informational category
- 2xx codes fall in the success category
- 3xx codes are for redirection
- 4xx is client error
- 5xx is server error

Here is a list of some common status codes and their meanings:

- 200 OK: the request was successful, and the result is appended with the response message.

- 404 File Not Found: the requested object doesn’t exist on the server.

- 400 Bad Request: generic error code that indicates that the request was in a format that the server could not comprehend.

- 500 HTTP Internal Server Error: the request could not be completed because the server encountered some unexpected error.

- 505 HTTP Version Not Supported: the requested HTTP version is not supported by the server.

Have a look at pages 39 and 40 of RFC 2616 for a comprehensive list

## Header Lines#

Let’s study the header lines.

- Connection type. In this case, indicates that the server will close the TCP connection after it sends the response.

- Date. The date at which the response was generated.

- Server. Gives server software specification of the server that generated the message. Apache in this case.

- Last-Modified. The date on which the object being sent was last modified.

- Content-Length. The length of the object being sent in 8-bit bytes.

- Content-Type. The type of content. The type of the file is not determined by the file extension of the object, but by this header.

- The response body contains the file requested.

## How HTTP Headers Are Chosen#

Lastly, you must be wondering how browsers decide which HTTP headers to include in requests and how servers decide which headers to return in the response. That depends on a complex mix of factors such as the browser, the user configurations and products.

## Cookies

### Introduction

You might have heard of the term ‘cookie’ used a lot in the context of computer networks and privacy. Let’s have a closer look at what they are.

HTTP is a stateless protocol, but we often see websites where session state is needed. For instance, imagine you are browsing for products on an e-commerce website. How does the server know if you are logged in or not, or if the protocol is stateless? How does the server know what’s in your shopping cart when checking out if the protocol is stateless? Cookies allow the server to keep track of this sort of information.

### How Cookies Work

- Cookies are unique string identifiers that can be stored on the client’s browser.


- These identifiers are set by the server through HTTP headers when the client first navigates to the website.

- After the cookie is set, it’s sent along with subsequent HTTP requests to the same server. This allows the server to know who is contacting it and hence serve content accordingly.

So the HTTP request, the HTTP response, the cookie file on the client’s browser, and a database of cookie-user values on the server’s end are all involved in the process of setting and using cookies.

## Set-Cookie

## Header

Let’s look at how cookies work in a bit more detail. When a server wants to set a cookie on the client-side, it includes the header Set-cookie: value in the HTTP response. This value is then appended to a special cookie file stored on your browser. The cookie file contains:

- The website’s domain

- The string value of the cookie

- The date that the cookie expires (yes, much like actual cookies, they do expire)

## The Dangers of Cookies#
While cookies seem like a great idea to make HTTP persistent when needed, cookies have been severely abused in the past.

If a website has stored a cookie on your browser, it knows exactly when you visit it, what pages you visit and in what order. This itself makes some people uncomfortable.

### Third-party Cookies

Also, websites may not necessarily know personally identifiable information about you such as your name (by the way, websites that require you to sign-up do know your name), and they may only know the value of your cookie. But what if websites can track what you do on other websites? Well, they can. Welcome to the concept of third-party cookies.

svg viewer
cookie monster; image attribution: https://www.flickr.com/photos/tomcrouse/23712101336
While we can’t go into too much detail, it suffices to know that third-party cookies are cookies set for domains that are not being visited.

### Example

- A user visits amazon.com.

- A cookie for free-stats.com is subsequently set on their browser because free-stats has placed an advertisement on Amazon. Notice that this is a third-party cookie!

- Suppose, the user visits ebay.com, and eBay also has placed an advertisement for free-stats.com.

- The same cookie set on the Amazon site will be reused and sent to free-stats along in an HTTP request with the name of the host that the user is on.

- Free-stats can in this way track every website the user visits that they are advertising on and create more targeted ads in order to generate greater revenue.

- Also, the public has largely considered third-party cookies to be a breach of privacy and so rejected them. Most modern browsers come with the in-built option to block third-party cookies.

###  Blocking Third-Party Cookies Is Not Enough!#

However, firms have come up with several workarounds including but not limited to:

- Respawning cookies
- Flash cookies
- Entity tags
- Canvas fingerprinting