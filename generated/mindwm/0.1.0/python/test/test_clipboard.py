# coding: utf-8

"""
    Mindwm API

    API defining the operations available in the Mindwm API

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from mindwm.models.clipboard import Clipboard

class TestClipboard(unittest.TestCase):
    """Clipboard unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Clipboard:
        """Test Clipboard
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Clipboard`
        """
        model = Clipboard()
        if include_optional:
            return Clipboard(
                type = '',
                source = 'eBAMDTMv2D2ylmgd10Z3UB6UkJSISSB5\\'qKX7HzKpul80FcVjSkp5IHYCm6w-v0dZfUofvKERjsmInY9s-EmMH6kw8gsnz',
                data = mindwm.models.clipboard_payload.ClipboardPayload(
                    start = [
                        56
                        ], 
                    stop = [
                        56
                        ], 
                    data = '0', 
                    type = 'primary', 
                    context = mindwm.models.clipboard_payload_context.ClipboardPayload_context(
                        window = '', ), ),
                id = '0',
                specversion = '0',
                datacontenttype = '0',
                dataschema = '0',
                subject = '0',
                time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data_base64 = ''
            )
        else:
            return Clipboard(
                id = '0',
                specversion = '0',
        )
        """

    def testClipboard(self):
        """Test Clipboard"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
