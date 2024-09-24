A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

Here, we will have the detailed learning of creating and using user-defined packages


Advantage of Java Package

1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

2) Java package provides access protection.

3) Java package removes naming collision.

Creating A Simple Package In Java
- To Compile: javac -d . Simple.java
- To Run: java mypack.Simple
- The -d is a switch that tells the compiler where to put the class file i.e. it represents destination. The . represents the current folder. 


<image src="https://static.javatpoint.com/images/package.JPG">

How to access package from another package?
There are three ways to access the package from outside the package.

-    import package.*;
-    import package.classname;
-    fully qualified name

1) Using packagename.*

If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.

The import keyword is used to make the classes and interface of another package accessible to the current package.

