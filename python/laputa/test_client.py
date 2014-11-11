import unittest
import client
import time
import laputalite


class LaputaClientTest(unittest.TestCase):
    @laputalite.laputa_lite_test('AS_20141031')
    def test_get_python_author(self):
        start_time = time.time()
        self.assertEqual(client.get_python_author(), 'GvR')
        self.assertEqual(client.get_python_author(), 'GvR')
        print "Finished in %.1f sec" % (time.time() - start_time)
