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