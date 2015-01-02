NIST Randomness Beacon Validator
================================


> Since early evening on September 5th, 2013 the US National Institute of Standards and Technology (NIST) has been publishing a 512-bit, full-entropy random number every minute of every day. What’s more, each number is cryptographically signed so that you can easily verify that it was generated by the NIST. A date stamp is included in the process, so that you can tell when the random values were created. And finally, all of the values are linked to the previous value in a chain so that you can detect if any of the past numbers in the series have been altered after the next number is published.
>
> http://hackaday.com/2014/12/19/nist-randomness-beacon/

Additional details are available [here] (https://beacon.nist.gov/home)

This Java library focuses on the validation of the cryptographic promises and dosen't provide a robust way of retriving the actual beacon record documents. The main class is `org.nist.randomness.beacon.Validator`. An example of how this logic can be driven is located in `org.nist.randomness.beacon.ValidatorTest`. Code similar to the following may be used to pool down and validate records 

```java
Validator vlad = new Validator();
vlad.setCertificate(Loader.loadCert(new URL("https://beacon.nist.gov/certificate/beacon.cer")));
vlad.isSignatureValid(new UnpackedRecord(Loader.loadRecord(new URL("https://beacon.nist.gov/rest/record/last"))));
```
