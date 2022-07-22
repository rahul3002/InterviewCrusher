# Operating System

- Operating systems are the foundation of modern digital devices. 
- These systems determine how you see and interact with your machines.
- Operating systems determine how we program an application, 
- what software we can use, and how hardware should be designed. 
- Understanding operating systems is essential for developers to ensure designing programs that work to the strengths of a particular operating system.

# What is an operating system?

- An operating system (OS) is the core software that contains a collection of services essential for the machine to run programs. Think of this as the manager of a computer’s memory and processes. An OS is how we can communicate with a computer without understanding the same language. Without an OS, a user would need to know dozens of command line statements to manually control each part of a computer.

- The most important function of an OS is to standardize and mediate programs and the machine’s internal hardware. The OS is how a computer schedules sequential tasks, completes tasks concurrently, and delegates resources. In other words, the OS is to provide both the platform and resources needed for programs to run.

- Before operating systems were commonplace, developers had to design their programs to work with individual pieces of hardware. However, it was impossible to know what hardware your customers would have, so widely distributed software was nearly impossible. Operating systems provide a standard medium that developers can program. If the system can run the OS, it can run your program.

# Popular operating systems for developers

There are many operating systems out there, many that you probably haven’t even heard of. They generally all provide the same base but have different functionalities such as support for hardware, security, intended user-base, or regular updates.

**Today, the three most popular operating systems used by developers are:**

## Linux:
- This operating system is an open-source operating system available for all computers. Linux’s open-source properties allow it to be highly customizable and well suited for installing and running other open-source programs. This combination of open-source technologies has allowed Linux systems to develop far faster than Windows or macOS.

- For this reason, Linux is the most popular OS for developers across the board, particularly in cybersecurity fields.

- However, Linux has a steep learning curve and can be difficult to pick up.

## macOS:

- This operating system is developed by Apple and is available on Mac machines. macOS is well-liked by developers for its Unix-based functions like built-in bash-shell utilities and a simple Unix file system. However, many find that macOS doesn’t have enough flexibility and instead opt for Linux

## Windows:

- This operating system is developed by Microsoft and is available on PC machines. Windows is known for its ease of use and consistent functionality across versions. Since Windows is simple, many developers use other operating systems that have more built-in functions, like macOS, or that are more changeable, like Linux.

#  What is a kernel?
- The kernel is the central core of an operating system that allows programs to access hardware resources. A kernel is how a system starts up, translates input, and outputs requests to the central processing unit (GPU).

- Each OS must have a kernel to function. As a result, the kernel is stored in restricted memory space so it’s not accidentally overwritten. Developers working on kernels aim to make it as small as possible without altering functionality so that more memory is open to the user.

- Kernels rarely change from version to version. In fact, the modern OS uses the same versions from over 20 years ago with only minor updates or modernizations.

**Linux** uses the Linux kernel
**macOS** uses the XNU kernel
**Windows** uses the Windows NT kernel


# Resource management

- Resource management is one of the most important services of a kernel. The kernel delegates computer resources like memory and CPU to each process being executed.

- By regulating processes, the kernel prevents greedy programs from starving the system and slowing down other concurrent programs. This service ensures that all processes have enough resources to function and that each process makes use of all available resources.