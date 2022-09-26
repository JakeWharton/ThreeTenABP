Change Log
==========

Version 1.4.1 *(2022-09-26)*
----------------------------

 * Update ThreeTenBP dependency to 1.6.2 ([change log][threeten162])
 * Update time zone data to 2022d(gtz).


Version 1.4.0 *(2022-03-21)*
----------------------------

 * Update ThreeTenBP dependency to 1.6.0 ([change log][threeten160])
 * Update time zone data to 2022a(gtz).


Version 1.3.1 *(2021-04-20)*
----------------------------

 * Update ThreeTenBP dependency to 1.5.1 ([change log][threeten151])
 * Update time zone data to 2021a.


Version 1.3.0 *(2020-10-26)*
----------------------------

 * Update ThreeTenBP dependency to 1.5.0 ([change log][threeten150])
 * Update time zone data to 2020d.


Version 1.2.4 *(2020-04-24)*
----------------------------

 * Update ThreeTenBP dependency to 1.4.4 ([change log][threeten144])
 
   This adds Japanese Reiwa era.

 * Update time zone data to 2020a.


Version 1.2.3 *(2020-03-27)*
----------------------------

 * Update ThreeTenBP dependency to 1.4.2 ([change log][threeten142]).
 
   This fixes a crash when attempting to deserialize a library type when using Java serialization
   and when your app is minified using R8's full mode.


Version 1.2.2 *(2020-01-13)*
----------------------------

 * Update ThreeTenBP dependency to 1.4.1 ([change log][threeten141]).
 * Update time zone data to 2019c.


Version 1.2.1 *(2019-06-03)*
----------------------------

 * Update ThreeTenBP dependency to 1.4.0 ([change log][threeten140]).
 * Update time zone data to 2019a.
 * Fix: Embed consumer R8/ProGuard rules to ensure serialization (e.g., through Parcelable) does not
   lose any information.


Version 1.2.0 *(2019-03-06)*
----------------------------

 * Add `AndroidThreeTen.init(Context, String)` overload for supplying a path to a custom timezone
   database stored in assets.


Version 1.1.2 *(2019-02-15)*
----------------------------

 * Update ThreeTenBP dependency to 1.3.8 ([change log][threeten138]).
 * Update time zone data to 2018g.


Version 1.1.1 *(2018-10-12)*
----------------------------

 * Update ThreeTenBP dependency to 1.3.7 ([change log][threeten137]).


Version 1.1.0 *(2018-04-20)*
----------------------------

 * Update ThreeTenBP dependency to 1.3.6 ([change log][threeten136]).
 * Update time zone data to 2017b.
 * New: Timezone database is now lazily initialized and no longer blocks application startup.
 * Fix: Useless `BuildConfig` class is no longer included.


Version 1.0.5 *(2017-02-02)*
----------------------------

 * Update ThreeTenBP dependency to 1.3.3 ([change log][threeten133]).


Version 1.0.4 *(2016-08-27)*
----------------------------

 * New: Initialization method over which accepts a `Context`.
 * Update time zone data to 2016e.
 * Update ThreeTenBP dependency to 1.3.2.
 * Fix: Ensure native resource is freed after reading the time zone data.


Version 1.0.3 *(2015-11-11)*
----------------------------

Update time zone data to 2015g.


Version 1.0.2 *(2015-08-02)*
----------------------------

 * Include a ProGuard rules file in the library which automatically suppresses harmless warnings
   from the library.
 * Fix: Correct logic which would incorrectly allow initialization to happen twice.


Version 1.0.1 *(2015-07-15)*
----------------------------

Update time zone data to 2015e.


Version 1.0.0 *(2015-07-15)*
----------------------------

Initial release.





 [threeten133]: https://www.threeten.org/threetenbp/changes-report.html#a1.3.3
 [threeten136]: https://www.threeten.org/threetenbp/changes-report.html#a1.3.6
 [threeten137]: https://www.threeten.org/threetenbp/changes-report.html#a1.3.7
 [threeten138]: https://www.threeten.org/threetenbp/changes-report.html#a1.3.8
 [threeten140]: https://www.threeten.org/threetenbp/changes-report.html#a1.4.0
 [threeten141]: https://www.threeten.org/threetenbp/changes-report.html#a1.4.1
 [threeten142]: https://www.threeten.org/threetenbp/changes-report.html#a1.4.2
 [threeten144]: https://www.threeten.org/threetenbp/changes-report.html#a1.4.4
 [threeten150]: https://www.threeten.org/threetenbp/changes-report.html#a1.5.0
 [threeten151]: https://www.threeten.org/threetenbp/changes-report.html#a1.5.1
 [threeten160]: https://www.threeten.org/threetenbp/changes-report.html#a1.6.0
 [threeten162]: https://www.threeten.org/threetenbp/changes-report.html#a1.6.2
