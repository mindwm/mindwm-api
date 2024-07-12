-module(prop_MindwWM).

-export([prop_test/0]).

prop_test() ->
  {ok, _} = application:ensure_all_started(MindwWM),
  MindwWM_statem:prop_main().
