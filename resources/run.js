try {
    require("source-map-support").install();
} catch(err) {
}
require("../target/cljs/test_dev/out/goog/bootstrap/nodejs.js");
require("../target/cljs/test_dev/tests.js");
goog.require("cljs.test.check.run_tests");
goog.require("cljs.nodejscli");
