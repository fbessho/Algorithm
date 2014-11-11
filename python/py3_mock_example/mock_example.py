from unittest.mock import patch
import mymodule

@patch('anothermodule.Spam')
@patch('mymodule.ClassName2')
@patch('mymodule.ClassName1')
def test(MockClass1, MockClass2, MockSpam):
    mymodule.ClassName1()
    mymodule.ClassName2()
    mymodule.create_classes()
    assert MockClass1 is mymodule.ClassName1
    assert MockClass2 is mymodule.ClassName2
    assert MockClass1.called
    assert MockClass2.called

test()
