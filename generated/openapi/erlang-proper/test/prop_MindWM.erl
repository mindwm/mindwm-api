-module(prop_MindWM).

-export([prop_test/0]).

prop_test() ->
  {ok, _} = application:ensure_all_started(MindWM),
  MindWM_statem:prop_main().
