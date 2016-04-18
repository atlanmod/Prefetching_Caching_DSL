# Prefetching_Caching_DSL
PrefetchML is a DSL to express Caching/Prefetching rules for EMF, and an execution engine that performs prefetching and caching actions through EMF and [NeoEMF](https://github.com/atlanmod/NeoEMF) API.

It relies on an XText-based editor that allows designers to create their prefetching plans, composed of a set of rules. A prefetching rule is composed of three parts
* A guard with a type that describe the event that triggers the rule
* A fetch action that describe the elements to load from the model when the rule is executed
* A remove operation that allows to remove specific elements from the cache after the fetch action

PrefetchML improves execution time of both EMF and NeoEMF based applications. The main difference between the two implementations is that NeoEMF one performs fetch queries at the database level, making their computation much faster than EMF implementation.

## Installation
  An update site will be provided in the next days to ease installation of the tool.
  For the moment, we provide a step by step installation to help you test this first version of the tool.
  * Install NeoEMF in your Eclipse environment using the [update site](http://atlanmod.github.io/NeoEMF/)
  * Clone this repository
  * Import the following projects in your workspace: fr.inria.atlanmod.prefetch.emf.aspectj, prefetch, fr.inria.atlanmod.neoemf.prefetching.ui

Eclipse m2e (maven plugin) has to be installed in your Eclipse environment to run PrefetchML.

## Usage

To create a PrefetchML specification (containing a set of prefetching plans for a given metamodel), run a new Eclipse application, and create a new file with the extension .prefetch. This will open the Prefetching Editor, that helps you to define prefetching and caching plans.

Once this is done, a new file is generated with the extension .prefetch.bin, that contains the prefetching and caching specification that can be executed by the PrefetchML engine.

### EMF Integration

Load your EMF resource as usual, and add the following lines after the loading instructions:

    // EMF load
    EMFPrefetcherRuntimer runtime = new EMFPrefetcherRuntime(resource);
    runtime.loadPrefetchScript(URI.createURI(myPrefetchMLSpecificationPath),resource);

Then, add the JVM parameter `-javaagent:path/to/aspectjweaver-1.8.6.jar` and run your application as usual. The aspectjweaver can be downloaded from [here](http://mvnrepository.com/artifact/org.aspectj/aspectjweaver/1.8.6) 

### NeoEMF Integration

Load your NeoEMF resource with the following options

    Map<Object,Object> options = new HashMap<Object,Object>();
    List<Object> storeOptions = new ArrayList<Object>();
    storeOptions.add(BlueprintsResourceOptions.EStoreGraphOption.PREFETCHING);
    resource.load(options);

Then add the following lines to give the PrefetchML description to the execution engine

    PrefetchingDirectWriteBlueprintsResourceEStoreImpl pStore = (PrefetchingDirectWriteBlueprintsResourceEStoreImpl)((PersistentResource)resource).eStore();
    pStore.getPrefetcher().loadPrefetchScript(URI.createURI(this.getScriptString()));

You can then run your application as usual.

## Benchmarks

The benchmarks are available in the project fr.inria.atlanmod.prefetching.benchmarks. Import this project and the ones in benchmarks.util in your workspace (an update site will also be provided in the next days).

To run the entire benchmarks, select in the package fr.inria.atlanmod.prefetching.benchmarks.tests the class AllTests, and run it with the following JVM parameters

    -XX:+UseConcMarkSweepGC
    -server
    -javaagent:path/to/aspectjweaver-1.8.6.jar

This will perform the three benchmark queries over the MoDisco and the JDT models. Note that the NeoEMF resources have to be created from XMI the first time the benchmarks are executed. This operation can take time, but is only required for the first execution (we can not put the Neo4j databases on github because they take too much space).

If you have any trouble running the PrefetchML benchmarks, please send an email at gwendal[dot]daniel[at]inria[dot]fr


