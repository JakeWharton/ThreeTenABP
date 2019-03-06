Change Log
==========

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





 [threeten133]: http://www.threeten.org/threetenbp/changes-report.html#a1.3.3
 [threeten136]: http://www.threeten.org/threetenbp/changes-report.html#a1.3.6
 [threeten137]: http://www.threeten.org/threetenbp/changes-report.html#a1.3.7
 [threeten138]: http://www.threeten.org/threetenbp/changes-report.html#a1.3.8
